package com;

public class Exercise6p2 {

    int[] blocks = new int[16];

    int[][] seenBlocks = new int[9000][16];

    int[] fixedSeenblocks = new int[16];

    int iterations = 0;

    public void execute() {
        blocks[0] = 4;
        blocks[1] = 1;
        blocks[2] = 15;
        blocks[3] = 12;
        blocks[4] = 0;
        blocks[5] = 9;
        blocks[6] = 9;
        blocks[7] = 5;
        blocks[8] = 5;
        blocks[9] = 8;
        blocks[10] = 7;
        blocks[11] = 3;
        blocks[12] = 14;
        blocks[13] = 5;
        blocks[14] = 12;
        blocks[15] = 3;

        updateSeenBlocks();
        while(true){
            rebalanceBlocks();
            if( checkRepeatedBlocks()) {
                iterations = 0;

                while(true) {
                    rebalanceBlocks();
                    if (checkSeenAgainRepeatedBlocks()) {
                        System.out.print(iterations);
                        break;
                    }
                }
                break;
            }
            updateSeenBlocks();
        }
    }

    private void rebalanceBlocks(){
        int position = 0;
        int highestValue = 0;
        for(int i=0; i<blocks.length; i++){
            if(blocks[i] > highestValue){
                highestValue = blocks[i];
                position = i;
            }
        }

        blocks[position] = 0;
        while(highestValue != 0){

            if(position >= blocks.length-1)
                position = 0;
            else
                position++;

            blocks[position]+=1;
            highestValue--;
        }

        iterations++;
    }

    private void updateSeenBlocks(){
        seenBlocks[iterations][0] = blocks[0];
        seenBlocks[iterations][1] = blocks[1];
        seenBlocks[iterations][2] = blocks[2];
        seenBlocks[iterations][3] = blocks[3];
        seenBlocks[iterations][4] = blocks[4];
        seenBlocks[iterations][5] = blocks[5];
        seenBlocks[iterations][6] = blocks[6];
        seenBlocks[iterations][7] = blocks[7];
        seenBlocks[iterations][8] = blocks[8];
        seenBlocks[iterations][9] = blocks[9];
        seenBlocks[iterations][10] = blocks[10];
        seenBlocks[iterations][11] = blocks[11];
        seenBlocks[iterations][12] = blocks[12];
        seenBlocks[iterations][13] = blocks[13];
        seenBlocks[iterations][14] = blocks[14];
        seenBlocks[iterations][15] = blocks[15];
    }

    private boolean checkRepeatedBlocks(){

        boolean repetition = false;
        for(int i=0; i<seenBlocks.length;i++){
            repetition = ( blocks[0] == seenBlocks[i][0] &&
                           blocks[1] == seenBlocks[i][1] &&
                           blocks[2] == seenBlocks[i][2] &&
                           blocks[3] == seenBlocks[i][3] &&
                           blocks[4] == seenBlocks[i][4] &&
                           blocks[5] == seenBlocks[i][5] &&
                           blocks[6] == seenBlocks[i][6] &&
                           blocks[7] == seenBlocks[i][7] &&
                           blocks[8] == seenBlocks[i][8] &&
                           blocks[9] == seenBlocks[i][9] &&
                           blocks[10] == seenBlocks[i][10] &&
                           blocks[11] == seenBlocks[i][11] &&
                           blocks[12] == seenBlocks[i][12] &&
                           blocks[13] == seenBlocks[i][13] &&
                           blocks[14] == seenBlocks[i][14] &&
                           blocks[15] == seenBlocks[i][15] );
            if(repetition) {
                fixedSeenblocks[0] = blocks[0];
                fixedSeenblocks[1] = blocks[1];
                fixedSeenblocks[2] = blocks[2];
                fixedSeenblocks[3] = blocks[3];
                fixedSeenblocks[4] = blocks[4];
                fixedSeenblocks[5] = blocks[5];
                fixedSeenblocks[6] = blocks[6];
                fixedSeenblocks[7] = blocks[7];
                fixedSeenblocks[8] = blocks[8];
                fixedSeenblocks[9] = blocks[9];
                fixedSeenblocks[10] = blocks[10];
                fixedSeenblocks[11] = blocks[11];
                fixedSeenblocks[12] = blocks[12];
                fixedSeenblocks[13] = blocks[13];
                fixedSeenblocks[14] = blocks[14];
                fixedSeenblocks[15] = blocks[15];
                break;
            }
        }
        return repetition;
    }

    private boolean checkSeenAgainRepeatedBlocks(){

        return    ( blocks[0] == fixedSeenblocks[0] &&
                    blocks[1] == fixedSeenblocks[1] &&
                    blocks[2] == fixedSeenblocks[2] &&
                    blocks[3] == fixedSeenblocks[3] &&
                    blocks[4] == fixedSeenblocks[4] &&
                    blocks[5] == fixedSeenblocks[5] &&
                    blocks[6] == fixedSeenblocks[6] &&
                    blocks[7] == fixedSeenblocks[7] &&
                    blocks[8] == fixedSeenblocks[8] &&
                    blocks[9] == fixedSeenblocks[9] &&
                    blocks[10] == fixedSeenblocks[10] &&
                    blocks[11] == fixedSeenblocks[11] &&
                    blocks[12] == fixedSeenblocks[12] &&
                    blocks[13] == fixedSeenblocks[13] &&
                    blocks[14] == fixedSeenblocks[14] &&
                    blocks[15] == fixedSeenblocks[15] );
    }

}