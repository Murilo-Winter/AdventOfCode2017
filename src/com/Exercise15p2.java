package com;

import java.io.IOException;
import java.net.URISyntaxException;

public class Exercise15p2 {

    public void execute(){
        System.out.println("part 2 " + process(722, 354));
    }

    public int process(int s1, int s2) {

        long p1 = s1;
        long p2 = s2;
        int c = 0;
        for (int i = 0; i < 5000000; i++) {
            do {
                p1 = (p1 * 16807) % 2147483647;
            } while (p1 % 4 != 0);
            do {
                p2 = (p2 * 48271) % 2147483647;
            } while (p2 % 8 != 0);

            if ((p1 & 65535) == (p2 & 65535))
                c++;
        }
        return c;

    }

}