package com;

import static java.lang.Math.abs;

public class Exercise3p2 {

    int rows = 591;
    int columns = 591;
    int[][] matrix = new int[rows][columns];

    int middleRow = (rows-1) / 2;
    int middleColumn = (columns-1)/2;

    public void execute() {

        initializeMatrix();

        int lastNumber = distributeNumbers();

        System.out.print("lastNumber");
    }

    private void initializeMatrix(){
        for(int c = 0; c < columns; c++){
            for(int r = 0; r < rows; r++) {
                matrix[r][c] = 0;
            }
        }
    }

    private int distributeNumbers() {
        char nextMovement = 'R';

        int numberRights = 1;
        int numberUps = 1;
        int numberLefts = 2;
        int numberDowns = 2;

        int currentRow = middleRow;
        int currentColumn = middleColumn;
        matrix[currentRow][currentColumn] = 1;

        while (true) {
            switch (nextMovement) {
                case 'R':
                    for (int x = 0; x < numberRights; x++) {
                        currentColumn += 1;
                        matrix[currentRow][currentColumn] = calculateNumber(currentRow, currentColumn);
                        if( matrix[currentRow][currentColumn] > 347991) break;
                    }
                    numberRights += 2;
                    nextMovement = 'U';
                    break;
                case 'U':
                    for (int x = 0; x < numberUps; x++) {
                        currentRow -= 1;
                        matrix[currentRow][currentColumn] = calculateNumber(currentRow, currentColumn);
                        if( matrix[currentRow][currentColumn] > 347991) break;
                    }
                    numberUps += 2;
                    nextMovement = 'L';
                    break;
                case 'L':
                    for (int x = 0; x < numberLefts; x++) {
                        currentColumn -= 1;
                        matrix[currentRow][currentColumn] = calculateNumber(currentRow, currentColumn);
                        if( matrix[currentRow][currentColumn] > 347991) break;
                    }
                    numberLefts += 2;
                    nextMovement = 'D';
                    break;
                case 'D':
                    for (int x = 0; x < numberDowns; x++) {
                        currentRow += 1;
                        matrix[currentRow][currentColumn] = calculateNumber(currentRow, currentColumn);
                        if( matrix[currentRow][currentColumn] > 347991) break;
                    }
                    numberDowns += 2;
                    nextMovement = 'R';
                    break;
            }
            if( matrix[currentRow][currentColumn] > 347991)
                return matrix[currentRow][currentColumn];
        }
    }

    private int calculateNumber(int currentRow, int currentColumn){

        int a = matrix[currentRow][currentColumn+1];
        int b = matrix[currentRow-1][currentColumn+1];
        int c = matrix[currentRow-1][currentColumn];
        int d = matrix[currentRow-1][currentColumn-1];
        int e = matrix[currentRow][currentColumn-1];
        int f = matrix[currentRow+1][currentColumn-1];
        int g = matrix[currentRow+1][currentColumn];
        int h = matrix[currentRow+1][currentColumn+1];

        return a + b + c + d + e + f + g + h;

    }

}

