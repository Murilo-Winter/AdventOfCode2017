package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10p1 {

    Integer currentPosition = 0;
    Integer skipSize = 0;

    Integer[] lengths = {192,69,168,160,78,1,166,28,0,83,198,2,254,255,41,12};
    List<Integer> elements = new ArrayList<>();

    public void execute() {

        //Initialize Array
        for(int i = 0; i < 256; i++){
            elements.add(i);
        }

        //For each length element
        for(int l = 0; l < lengths.length; l++){

            //Revert the sublist
            revertElements(lengths[l]);

            currentPosition += lengths[l] + skipSize;
            if(currentPosition >= elements.size()) currentPosition-= elements.size();
            skipSize++;
        }

        System.out.print(elements.get(0) * elements.get(1));
    }

    private void revertElements(Integer length){

        List<Integer> revertedElements = new ArrayList<>();

        for(int i = 0; i < length; i++) {

            Integer extractPostion = currentPosition+i;
            if(extractPostion >= elements.size())
                extractPostion-=elements.size();

            revertedElements.add(elements.get(extractPostion));
        }

        Collections.reverse(revertedElements);

        for(int i = 0; i < length; i++) {

            Integer extractPostion = currentPosition+i;
            if(extractPostion >= elements.size())
                extractPostion-=elements.size();

            elements.set(extractPostion, revertedElements.get(i));
        }
    }


}