package com;

import java.util.*;

public class Exercise13p1 {

    String input = "0: 3\n" +
            "1: 2\n" +
            "2: 4\n" +
            "4: 8\n" +
            "6: 5\n" +
            "8: 6\n" +
            "10: 6\n" +
            "12: 4\n" +
            "14: 6\n" +
            "16: 6\n" +
            "18: 17\n" +
            "20: 8\n" +
            "22: 8\n" +
            "24: 8\n" +
            "26: 9\n" +
            "28: 8\n" +
            "30: 12\n" +
            "32: 12\n" +
            "34: 10\n" +
            "36: 12\n" +
            "38: 12\n" +
            "40: 8\n" +
            "42: 12\n" +
            "44: 12\n" +
            "46: 10\n" +
            "48: 12\n" +
            "50: 12\n" +
            "52: 14\n" +
            "54: 14\n" +
            "56: 12\n" +
            "58: 14\n" +
            "60: 14\n" +
            "62: 14\n" +
            "64: 14\n" +
            "66: 14\n" +
            "68: 12\n" +
            "70: 14\n" +
            "72: 14\n" +
            "74: 14\n" +
            "76: 14\n" +
            "80: 18\n" +
            "82: 14\n" +
            "90: 18";
    List<String> inputList = Arrays.asList(input.split("\n"));


    Map<Integer, Integer> layerMap = new HashMap<>();
    Map<Integer, ScanPosition> scannerPosition = new HashMap<>();
    Integer position = -1;

    Integer severity = 0;

    public void execute() {

        buildFirewall();

        while (true) {
            movePosition();
            if(position > 90)
                break;
            checkCaught();
            moveScanner();
        }

        System.out.print(severity);
    }

    private void buildFirewall() {
        for (String line : inputList) {
            List<String> layerStr = Arrays.asList(line.split(": "));
            layerMap.put(Integer.valueOf(layerStr.get(0)), Integer.valueOf(layerStr.get(1)));
            scannerPosition.put(Integer.valueOf(layerStr.get(0)), new ScanPosition(0, 'D'));
        }
    }

    private void moveScanner() {
        for(Map.Entry<Integer, Integer> layer: layerMap.entrySet()) {
            ScanPosition currentPosition = scannerPosition.get(layer.getKey());
            ScanPosition newPosition;
            if (currentPosition.position.equals(layer.getValue()- 1) && currentPosition.direction == 'D') {
                newPosition = new ScanPosition(currentPosition.position - 1, 'U');
            } else if (currentPosition.position.equals(0) && currentPosition.direction == 'U') {
                newPosition = new ScanPosition(currentPosition.position + 1, 'D');
            } else if (currentPosition.direction == 'D') {
                newPosition = new ScanPosition(currentPosition.position + 1, 'D');
            } else {
                newPosition = new ScanPosition(currentPosition.position - 1, 'U');
            }
            scannerPosition.replace(layer.getKey(), newPosition);
        }

    }

    private void movePosition() {
        position++;
    }

    private void checkCaught() {
        if (scannerPosition.containsKey(position)) {
            if (scannerPosition.get(position).position == 0) {
                severity += position * layerMap.get(position);
            }
        }
    }

    private static class ScanPosition {
        public Integer position;
        public char direction;

        public ScanPosition(Integer position, char direction) {
            this.position = position;
            this.direction = direction;
        }
    }

}
