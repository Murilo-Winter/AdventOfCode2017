package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise21p1 {

    public void execute() {
        Scanner input = null;
        String line = null;
        ArrayList<String> lines = new ArrayList<>();
        try {
            input = new Scanner(new File("C:\\Users\\muril\\IdeaProjects\\AventOfCode\\src\\com\\day21"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            line = input.nextLine();
            lines.add(line);
        }
        System.out.println("PART 1");
        startCount(lines, 5);
        System.out.println("PART 2");
        startCount(lines, 18);
    }

    HashMap<Integer, String> dict2 = new HashMap<>();
    HashMap<Integer, String> dict3 = new HashMap<>();


    private void startCount(ArrayList<String> lines, int iterations) {

        for (int i = 0; i < lines.size(); i++) {
            String[] nums = lines.get(i).split(" ");
            String[] pattern = nums[0].split("/");
            if (pattern.length == 2) {
                int pat = patternToNumber(nums[0]);
                dict2.put(pat, nums[2]);
                flipPatterns2(pat, nums[2]);
                rotatePatterns2(pat, nums[2]);
            } else {
                int pat = patternToNumber(nums[0]);
                dict3.put(pat, nums[2]);
                flipPatterns3(pat, nums[2]);
                rotatePatterns3(pat, nums[2]);
            }
        }
        String current = ".#./..#/###";
        int sizeAcross = 0;
        //divide up result
        int newSize = 4;
        for (int count = 0; count < iterations; count++) {
            String[] parts = current.split("/");
            ArrayList<String> patterns = new ArrayList<>();
            int size = parts[0].length();
            boolean use2 = false;
            if (size % 2 == 0) {
                //split into sections of 2
                sizeAcross += 2;
                use2 = true;
                for (int i = 0; i < size; i += 2) {
                    for (int j = 0; j < size; j += 2) {
                        String a = parts[i].substring(j, j + 2) + "/" + parts[i + 1].substring(j, j + 2);
                        patterns.add(a);
                    }
                }
                newSize = (newSize / 2) * 3;
            } else {
                //split into sections of 3
                for (int i = 0; i < size; i += 3) {
                    for (int j = 0; j < size; j += 3) {
                        String a = parts[i].substring(j, j + 3) + "/" + parts[i + 1].substring(j, j + 3) +
                                "/" + parts[i + 2].substring(j, j + 3);
                        patterns.add(a);
                    }
                }
                newSize = (newSize / 3) * 4;
            }
            //go through arraylist and get result
            String res;
            String[] rows = new String[newSize];
            int index = 0;
            int j = 0;

            for (String pat : patterns) {
                if (use2) {
                    res = dict2.get(patternToNumber(pat));
                } else {
                    res = dict3.get(patternToNumber(pat));
                }
                String[] resultRows = res.split("/");
                sizeAcross = newSize / resultRows.length;
                for (int i = 0; i < resultRows.length; i++) {
                    if (rows[i + index] == null) {
                        rows[i + index] = resultRows[i];
                    } else {
                        rows[i + index] = rows[i + index] + resultRows[i];
                    }
                }
                j++;
                if (sizeAcross > 0 && j % sizeAcross == 0) {
                    index += resultRows.length;
                }
            }
            //put back together
            for (int i = 0; i < newSize; i++) {
                if (i == 0) {
                    current = rows[i];
                } else {
                    current = current + "/" + rows[i];
                }
            }
            System.out.println("Iteration: " + count);
        }

        //count the number of # in start
        int sum = 0;
        for (int i = 0; i < current.length(); i++) {
            if (current.charAt(i) == '#') {
                sum++;
            }
        }
        System.out.println("Answer: " + sum);
    }

    private int patternToNumber(String pattern) {
        String[] pat = pattern.split("/");
        int mult = 1;
        int num = 0;
        for (int i = 0; i < pat.length; i++) {
            for (int j = 0; j < pat[i].length(); j++) {
                if (pat[i].charAt(j) == '#') {
                    num += mult;
                }
                mult *= 2;
            }
        }
        return num;
    }

    private void rotatePatterns2(int num, String result) {
        int rot1 = 0;
        int rot2 = 0;
        int rot3 = 0;
        if (num % 2 == 1) {
            rot1 += 2;
            rot2 += 8;
            rot3 += 4;
        }
        num /= 2;
        if (num % 2 == 1) {
            rot1 += 8;
            rot2 += 4;
            rot3 += 1;
        }
        num /= 2;
        if (num % 2 == 1) {
            rot1 += 1;
            rot2 += 2;
            rot3 += 8;
        }
        num /= 2;
        if (num % 2 == 1) {
            rot1 += 4;
            rot2 += 1;
            rot3 += 2;
        }
        dict2.put(rot1, result);
        flipPatterns2(rot1, result);
        dict2.put(rot2, result);
        flipPatterns2(rot2, result);
        dict2.put(rot3, result);
        flipPatterns2(rot3, result);
    }

    private void flipPatterns2(int num, String result) {
        int flipx = 0;
        int flipy = 0;
        if (num % 2 == 1) {
            flipx += 2;
            flipy += 4;
        }
        num /= 2;
        if (num % 2 == 1) {
            flipx += 1;
            flipy += 8;
        }
        num /= 2;
        if (num % 2 == 1) {
            flipx += 8;
            flipy += 1;
        }
        num /= 2;
        if (num % 2 == 1) {
            flipx += 4;
            flipy += 2;
        }
        dict2.put(flipx, result);
        dict2.put(flipy, result);
    }

    private void rotatePatterns3(int num, String result) {
        int rot1 = 0;
        int rot2 = 0;
        int rot3 = 0;
        if (num % 2 == 1) { //a
            rot1 += 4;
            rot2 += 256;
            rot3 += 64;
        }
        num /= 2;
        if (num % 2 == 1) { //b
            rot1 += 32;
            rot2 += 128;
            rot3 += 8;
        }
        num /= 2;
        if (num % 2 == 1) { //c
            rot1 += 256;
            rot2 += 64;
            rot3 += 1;
        }
        num /= 2;
        if (num % 2 == 1) { //d
            rot1 += 2;
            rot2 += 32;
            rot3 += 128;
        }
        num /= 2;
        if (num % 2 == 1) { //e
            rot1 += 16;
            rot2 += 16;
            rot3 += 16;
        }
        num /= 2;
        if (num % 2 == 1) { //f
            rot1 += 128;
            rot2 += 8;
            rot3 += 2;
        }
        num /= 2;
        if (num % 2 == 1) { //g
            rot1 += 1;
            rot2 += 4;
            rot3 += 256;
        }
        num /= 2;
        if (num % 2 == 1) { //h
            rot1 += 8;
            rot2 += 2;
            rot3 += 32;
        }
        num /= 2;
        if (num % 2 == 1) { //i
            rot1 += 64;
            rot2 += 1;
            rot3 += 4;
        }
        dict3.put(rot1, result);
        flipPatterns3(rot1, result);
        dict3.put(rot2, result);
        flipPatterns3(rot2, result);
        dict3.put(rot3, result);
        flipPatterns3(rot3, result);
    }

    private void flipPatterns3(int num, String result) {
        int flipx = 0;
        int flipy = 0;

        if (num % 2 == 1) { //a
            flipx += 4;
            flipy += 64;
        }
        num /= 2;
        if (num % 2 == 1) { //b
            flipx += 2;
            flipy += 128;
        }
        num /= 2;
        if (num % 2 == 1) { //c
            flipx += 1;
            flipy += 256;
        }
        num /= 2;
        if (num % 2 == 1) { //d
            flipx += 32;
            flipy += 8;
        }
        num /= 2;
        if (num % 2 == 1) { //e
            flipx += 16;
            flipy += 16;
        }
        num /= 2;
        if (num % 2 == 1) { //f
            flipx += 8;
            flipy += 32;
        }
        num /= 2;
        if (num % 2 == 1) { //g
            flipx += 256;
            flipy += 1;
        }
        num /= 2;
        if (num % 2 == 1) { //h
            flipx += 128;
            flipy += 2;
        }
        num /= 2;
        if (num % 2 == 1) { //i
            flipx += 64;
            flipy += 4;
        }
        dict3.put(flipx, result);
        dict3.put(flipy, result);
    }
}
