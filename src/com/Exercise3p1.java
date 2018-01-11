package com;

import static java.lang.Math.abs;

public class Exercise3p1 {

    int rows = 591;
    int columns = 591;
    int[][] matrix = new int[rows][columns];

    int middleRow = (rows-1) / 2;
    int middleColumn = (columns-1)/2;

    public void execute() {

        int[] lastNumberPosition = distributeNumbers();

        int yDistance = abs(lastNumberPosition[0] - middleRow);
        int xDistance = abs(lastNumberPosition[1] - middleColumn);

        System.out.print(yDistance + xDistance);
    }

    private int[] distributeNumbers() {
        char nextMovement = 'R';

        int numberRights = 1;
        int numberUps = 1;
        int numberLefts = 2;
        int numberDowns = 2;

        int currentRow = middleRow;
        int currentColumn = middleColumn;
        matrix[currentRow][currentColumn] = 1;

        int currentNumber = 2;

        while (currentNumber < 347991) {
            switch (nextMovement) {
                case 'R':
                    for (int x = 0; x < numberRights; x++) {
                        currentColumn += 1;
                        matrix[currentRow][currentColumn] = currentNumber;
                        currentNumber++;
                        if( currentNumber > 347991) break;
                    }
                    numberRights += 2;
                    nextMovement = 'U';
                    break;
                case 'U':
                    for (int x = 0; x < numberUps; x++) {
                        currentRow -= 1;
                        matrix[currentRow][currentColumn] = currentNumber;
                        currentNumber++;
                        if( currentNumber > 347991) break;
                    }
                    numberUps += 2;
                    nextMovement = 'L';
                    break;
                case 'L':
                    for (int x = 0; x < numberLefts; x++) {
                        currentColumn -= 1;
                        matrix[currentRow][currentColumn] = currentNumber;
                        currentNumber++;
                        if( currentNumber > 347991) break;
                    }
                    numberLefts += 2;
                    nextMovement = 'D';
                    break;
                case 'D':
                    for (int x = 0; x < numberDowns; x++) {
                        currentRow += 1;
                        matrix[currentRow][currentColumn] = currentNumber;
                        currentNumber++;
                        if( currentNumber > 347991) break;
                    }
                    numberDowns += 2;
                    nextMovement = 'R';
                    break;
            }
        }
        int[] lastNumberPosition = new int[2];
        lastNumberPosition[0] = currentRow;
        lastNumberPosition[1] = currentColumn;
        return lastNumberPosition;
    }

}

