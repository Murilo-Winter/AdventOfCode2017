package com;

public class Exercise14p1 {

    String input = "vbqugkhl";

    Character[][] disk = new Character[128][128];



    Integer usedSpace = 0;

    public void execute() {

        for(int i = 0; i < 128; i++) {
            String value = input + "-" + i;
            Exercise10p2Aux exercise10p2 = new Exercise10p2Aux();
            String hash = exercise10p2.execute(value);
            String binary = getBinaryValue(hash);
            for (int j = 0; j < 128; j++) {
                disk[i][j] = binary.charAt(j);
            }
        }

        for(int i = 0; i < 128; i++)
            for(int j = 0; j < 128; j++){
            if(disk[i][j] == '1')
                usedSpace++;
        }

        System.out.println(usedSpace);
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