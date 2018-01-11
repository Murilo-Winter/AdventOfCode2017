package com;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Exercise23p1 {

    String input = "set b 79\n" +
            "set c b\n" +
            "jnz a 2\n" +
            "jnz 1 5\n" +
            "mul b 100\n" +
            "sub b -100000\n" +
            "set c b\n" +
            "sub c -17000\n" +
            "set f 1\n" +
            "set d 2\n" +
            "set e 2\n" +
            "set g d\n" +
            "mul g e\n" +
            "sub g b\n" +
            "jnz g 2\n" +
            "set f 0\n" +
            "sub e -1\n" +
            "set g e\n" +
            "sub g b\n" +
            "jnz g -8\n" +
            "sub d -1\n" +
            "set g d\n" +
            "sub g b\n" +
            "jnz g -13\n" +
            "jnz f 2\n" +
            "sub h -1\n" +
            "set g b\n" +
            "sub g c\n" +
            "jnz g 2\n" +
            "jnz 1 3\n" +
            "sub b -17\n" +
            "jnz 1 -23";

    List<String> inputList = Arrays.asList(input.split("\n"));
    List<List<String>> commands = new ArrayList<>();

    Map<String, Long> variables = new HashMap<>();

    Queue<Long> sent = new LinkedBlockingQueue<>();

    public void execute() {
        readCommands();
        initializeVariables();

        Long i = 0L;

        Integer mulCount = 0;

        boolean cont = true;
        while (cont) {

            if (i < 0L || i >= 32L) {
                cont = false;
                break;
            }

            List<String> command = commands.get(i.intValue());

            Long firstValue = 0L;
            if (command.get(1).matches("[a-zA-Z]+"))
                firstValue = variables.get(command.get(1));
            else
                firstValue = Long.valueOf(command.get(1));

            Long secondValue = 0L;
            if (command.size() == 3) {
                if (command.get(2).matches("[a-zA-Z]+"))
                    secondValue = variables.get(command.get(2));
                else
                    secondValue = Long.valueOf(command.get(2));
            }

            switch (command.get(0)) {

                case "set": {
                    variables.put(command.get(1), secondValue);
                    i++;
                    continue;
                }

                case "sub": {
                    variables.put(command.get(1), firstValue - secondValue);
                    i++;
                    continue;
                }

                case "mul": {
                    variables.put(command.get(1), firstValue * secondValue);
                    i++;
                    mulCount++;
                    continue;
                }
                case "jnz": {
                    if (firstValue != 0)
                        i += secondValue;
                    else
                        i++;
                }
            }
        }
        System.out.print(mulCount);
    }

    private void readCommands() {
        for (String line : inputList) {
            commands.add(Arrays.asList(line.split(" ")));
        }
    }

    private void initializeVariables() {
        variables.put("a", 0L);
        variables.put("b", 0L);
        variables.put("c", 0L);
        variables.put("d", 0L);
        variables.put("e", 0L);
        variables.put("f", 0L);
        variables.put("g", 0L);
        variables.put("h", 0L);
    }

}
