package com;

import java.util.ArrayList;

public class Exercise17p1 {

    Long steps = 394L;

    public void execute() {

        ArrayList<Long> list = new ArrayList<>();
        list.add(0, 0L);
        Long currentPosition = 0L;

        for (Long nextNumber = 1L; nextNumber <= 2017L; nextNumber++) {
            Long newPosition = currentPosition + steps;

            Long listSize = Long.valueOf(list.size());
            while (newPosition >= listSize) {

                while (newPosition >= listSize * 10000000L) {
                    newPosition -= listSize * 10000000L;

                }
                while (newPosition >= listSize * 1000000L) {
                    newPosition -= listSize * 1000000L;

                }
                while (newPosition >= listSize * 100000L) {
                    newPosition -= listSize * 100000L;

                }
                while (newPosition >= listSize * 10000L) {
                    newPosition -= listSize * 10000L;

                }
                while (newPosition >= listSize * 1000L) {
                    newPosition -= listSize * 1000L;

                }
                while (newPosition >= listSize * 100L) {
                    newPosition -= listSize * 100L;

                }
                while (newPosition >= listSize * 10L) {
                    newPosition -= listSize * 10L;

                }
                while (newPosition >= listSize) {
                    newPosition -= listSize;
                }
            }

            Integer intNewPosition = Math.toIntExact(newPosition);
            list.add(intNewPosition+1, nextNumber);
            currentPosition = newPosition+1L;
        }

        System.out.print("");

    }
}