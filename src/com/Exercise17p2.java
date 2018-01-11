package com;

public class Exercise17p2 {

    public void execute() {
        int input = 394, index = 0, val = 0;
        for (int i = 1; i <= 50000000; i++) {
            index = (input + index) % i + 1;
            if (index == 1)
                val = i;
        }
        System.out.println(val);
    }
}
