package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise25p1 {

    private int interactions = 12425180;
    private Integer position = 0;

    private List<Boolean> tape = new ArrayList<>();
    private char state = 'A';
    private int checksum = 0;

    public void execute() {

        for (int i = 0; i < interactions; i++)
            processRules();

        runDiagnostic();

        System.out.println(checksum);
    }

    private void processRules() {

        if(position >= tape.size())
            tape.add(position, false);

        switch (state) {
            case 'A': {
                if (!tape.get(position)) {
                    tape.set(position, true);
                    position++;
                    state = 'B';
                } else {
                    tape.set(position, false);
                    position++;
                    state = 'F';
                }
                break;
            }
            case 'B': {
                if (!tape.get(position)) {
                    tape.set(position, false);
                    position--;
                    state = 'B';
                } else {
                    tape.set(position, true);
                    position--;
                    state = 'C';
                }
                break;
            }
            case 'C': {
                if (!tape.get(position)) {
                    tape.set(position, true);
                    position--;
                    state = 'D';
                } else {
                    tape.set(position, false);
                    position++;
                    state = 'C';
                }
                break;
            }
            case 'D': {
                if (!tape.get(position)) {
                    tape.set(position, true);
                    position--;
                    state = 'E';
                } else {
                    tape.set(position, true);
                    position++;
                    state = 'A';
                }
                break;
            }
            case 'E': {
                if (!tape.get(position)) {
                    tape.set(position, true);
                    position--;
                    state = 'F';
                } else {
                    tape.set(position, false);
                    position--;
                    state = 'D';
                }
                break;
            }
            case 'F': {
                if (!tape.get(position)) {
                    tape.set(position, true);
                    position++;
                    state = 'A';
                } else {
                    tape.set(position, false);
                    position--;
                    state = 'E';
                }
                break;
            }
        }

        if (position == -1){
            tape.add(0, false);
            position = 0;
        }
    }

    private void runDiagnostic() {
        for (boolean square : tape) {
            if (square)
                checksum++;
        }
    }

}

