package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10p2Aux {

    Integer currentPosition = 0;
    Integer skipSize = 0;
    String lengthsUnformatted;
    ArrayList<Integer> lengths = new ArrayList<>();
    List<Integer> elements = new ArrayList<>();
    List<Integer> denseHashElements = new ArrayList<>();
    String hexadecimal = "";

    public String execute(String lengthsUnformatted) {
        this.lengthsUnformatted = lengthsUnformatted;

        initializeLengths();
        initializeElements();
        for (int i = 0; i < 64; i++) {
            performRound();
        }
        defineHash();
        convertToHexa();

        return hexadecimal;

    }

    private void convertToHexa() {
        for (int i = 0; i < denseHashElements.size(); i++) {
            String newHexa = Integer.toHexString(denseHashElements.get(i));
            if (newHexa.length() == 1)
                newHexa = "0" + newHexa;
            hexadecimal += newHexa;
        }
    }

    private void defineHash() {
        for (int i = 0; i < 16; i++) {
            Integer a = elements.get(16*i + 0)
                    ^ elements.get(16*i + 1)
                    ^ elements.get(16*i + 2)
                    ^ elements.get(16*i + 3)
                    ^ elements.get(16*i + 4)
                    ^ elements.get(16*i + 5)
                    ^ elements.get(16*i + 6)
                    ^ elements.get(16*i + 7)
                    ^ elements.get(16*i + 8)
                    ^ elements.get(16*i + 9)
                    ^ elements.get(16*i + 10)
                    ^ elements.get(16*i + 11)
                    ^ elements.get(16*i + 12)
                    ^ elements.get(16*i + 13)
                    ^ elements.get(16*i + 14)
                    ^ elements.get(16*i + 15);
            denseHashElements.add(a);
        }
    }

    private void performRound() {
        //For each length element
        for (int l = 0; l < lengths.size(); l++) {

            //Revert the sublist
            revertElements(lengths.get(l));

            currentPosition += lengths.get(l) + skipSize;
            while (currentPosition >= elements.size())
                currentPosition -= elements.size();
            skipSize++;
        }
    }

    private void revertElements(Integer length) {

        List<Integer> revertedElements = new ArrayList<>();

        for (int i = 0; i < length; i++) {

            Integer extractPostion = currentPosition + i;
            if (extractPostion >= elements.size())
                extractPostion -= elements.size();

            revertedElements.add(elements.get(extractPostion));
        }

        Collections.reverse(revertedElements);

        for (int i = 0; i < length; i++) {

            Integer extractPostion = currentPosition + i;
            if (extractPostion >= elements.size())
                extractPostion -= elements.size();

            elements.set(extractPostion, revertedElements.get(i));
        }
    }

    private void initializeElements() {
        //Initialize Array
        for (int i = 0; i < 256; i++) {
            elements.add(i);
        }
    }

    private void initializeLengths() {
        //Get ASCII value
        for (int i = 0; i < lengthsUnformatted.length(); i++) {
            lengths.add((int) lengthsUnformatted.charAt(i));
        }
        lengths.add(17);
        lengths.add(31);
        lengths.add(73);
        lengths.add(47);
        lengths.add(23);
    }

}