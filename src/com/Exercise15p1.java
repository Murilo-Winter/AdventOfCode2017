package com;

import java.util.HashMap;
import java.util.Map;

public class Exercise15p1 {

    Long genAMultFactor = 16807L;
    Long genBMultFactor = 48271L;
    Long dividend = 2147483647L;

    Long genAStartValue = 722L;
    Long genBStartValue = 354L;

    Long count = 0L;

    public void execute() {

        Long apreviousValue = genAStartValue;
        Long bpreviousValue = genBStartValue;

        for(int i = 0; i < 40000000; i++) {
            apreviousValue = (apreviousValue * genAMultFactor) % dividend;
            bpreviousValue = (bpreviousValue * genBMultFactor) % dividend;

            String aBinary = Long.toString(apreviousValue,2);
            String bBinary = Long.toString(bpreviousValue,2);

            if(aBinary.length() >=16)
                aBinary = aBinary.substring(aBinary.length()-16, aBinary.length());
            else{
                while(aBinary.length() < 16)
                    aBinary = "0" + aBinary;
            }

            if(bBinary.length() >=16)
                bBinary = bBinary.substring(bBinary.length()-16, bBinary.length());
            else{
                while(bBinary.length() < 16)
                    bBinary = "0" + bBinary;
            }

            if(aBinary.equals(bBinary))
                count++;
        }
        System.out.print(count);
    }

}

