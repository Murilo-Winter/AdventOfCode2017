package com;

import java.util.*;

public class Exercise18p1 {

    String input = "set i 31\n" +
            "set a 1\n" +
            "mul p 17\n" +
            "jgz p p\n" +
            "mul a 2\n" +
            "add i -1\n" +
            "jgz i -2\n" +
            "add a -1\n" +
            "set i 127\n" +
            "set p 826\n" +
            "mul p 8505\n" +
            "mod p a\n" +
            "mul p 129749\n" +
            "add p 12345\n" +
            "mod p a\n" +
            "set b p\n" +
            "mod b 10000\n" +
            "snd b\n" +
            "add i -1\n" +
            "jgz i -9\n" +
            "jgz a 3\n" +
            "rcv b\n" +
            "jgz b -1\n" +
            "set f 0\n" +
            "set i 126\n" +
            "rcv a\n" +
            "rcv b\n" +
            "set p a\n" +
            "mul p -1\n" +
            "add p b\n" +
            "jgz p 4\n" +
            "snd a\n" +
            "set a b\n" +
            "jgz 1 3\n" +
            "snd b\n" +
            "set f 1\n" +
            "add i -1\n" +
            "jgz i -11\n" +
            "snd a\n" +
            "jgz f -16\n" +
            "jgz a -19";

    List<String> inputList = Arrays.asList(input.split("\n"));
    List<List<String>> commands = new ArrayList<>();
    Map<String, Long> variables = new HashMap<>();
    Long lastPlayedSound = -1L;

    public void execute() {
        readCommands();
        initializeVariables();

        boolean cont = true;
        int i = 0;
        while (cont) {

            List<String> command = commands.get(i);

            Long firstValue = 0L;
            if (command.get(1).matches("[a-zA-Z]+"))
                firstValue = variables.get(command.get(1));
            else
                firstValue = Long.valueOf(command.get(2));

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

                case "add": {
                    variables.put(command.get(1), firstValue + secondValue);
                    i++;
                    continue;
                }

                case "mul": {
                    variables.put(command.get(1), firstValue * secondValue);
                    i++;
                    continue;
                }
                case "mod": {
                    variables.put(command.get(1), firstValue % secondValue);
                    i++;
                    continue;
                }
                case "snd": {
                    lastPlayedSound = firstValue;
                    i++;
                    continue;
                }
                case "rcv": {
                    if (firstValue != 0) {
                        cont = false;
                        continue;
                    }
                    i++;
                    continue;

                }
                case "jgz": {
                    if (firstValue > 0)
                        i += secondValue;
                    else
                        i++;
                }
            }
        }
        System.out.print(lastPlayedSound);
    }

    private void readCommands() {
        for (String line : inputList) {
            commands.add(Arrays.asList(line.split(" ")));
        }
    }

    private void initializeVariables() {
        for (List<String> command : commands) {
            if (command.get(1).matches(("[a-zA-Z]+")))
                variables.put(command.get(1), 0L);
            if (command.size() == 3 && command.get(2).matches(("[a-zA-Z]+")))
                variables.put(command.get(2), 0L);
        }
    }

}
