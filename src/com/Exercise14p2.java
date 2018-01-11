package com;

public class Exercise14p2 {

    String input = "vbqugkhl";

    Integer[][] disk = new Integer[128][128];

    Integer region = 2;

    public void execute() {

        formDisk();

        formRegions();

        System.out.println(region-2);
    }

    private void formRegions(){

        for(int i = 0; i < 128; i++)
            for(int j = 0; j < 128; j++){
                if(disk[i][j] == 1){
                    disk[i][j] = region;
                    assembleRegion(i,j);
                    region++;
                }
            }
    }

    private void assembleRegion(int i, int j) {

        //LEFT
        if(i != 0 && disk[i-1][j] == 1){
            disk[i-1][j] = region;
            assembleRegion(i-1, j);
        }
        //RIGHT
        if(i != 127 && disk[i+1][j] == 1){
            disk[i+1][j] = region;
            assembleRegion(i+1, j);
        }
        //UP
        if(j != 0 && disk[i][j-1] == 1){
            disk[i][j-1] = region;
            assembleRegion(i, j-1);
        }
        //DOWN
        if(j != 127 && disk[i][j+1] == 1){
            disk[i][j+1] = region;
            assembleRegion(i, j+1);
        }
    }

    private void formDisk() {
        for(int i = 0; i < 128; i++) {
            String value = input + "-" + i;
            Exercise10p2Aux exercise10p2 = new Exercise10p2Aux();
            String hash = exercise10p2.execute(value);
            String binary = getBinaryValue(hash);
            for (int j = 0; j < 128; j++) {
                disk[i][j] = Integer.valueOf(String.valueOf(binary.charAt(j)));
            }
        }
    }

    private String getBinaryValue(String hash){

        String binary = new String();

        for(int i = 0; i < hash.length(); i++) {
            String value = Integer.toBinaryString(Integer.parseInt(String.valueOf(hash.charAt(i)), 16));
            while(value.length() < 4)
                value = "0" + value;

            binary = binary + value;
        }
        return binary;

    }

}