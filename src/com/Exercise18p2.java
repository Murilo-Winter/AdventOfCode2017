package com;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Exercise18p2 {

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

    Map<String, Long> variables0 = new HashMap<>();
    Map<String, Long> variables1 = new HashMap<>();

    Queue<Long> sent0 = new LinkedBlockingQueue<>();
    Queue<Long> sent1 = new LinkedBlockingQueue<>();

    public void execute() {
        readCommands();
        initializeVariables();

        Long i0 = 0L;
        Long i1 = 0L;
        boolean hold0 = false;
        boolean hold1 = false;

        int program1SentValue = 0;

        while (true) {

            while (!hold0 && i0 < commands.size()) {

                List<String> command = commands.get(i0.intValue());

                Long firstValue = 0L;
                if (command.get(1).matches("[a-zA-Z]+"))
                    firstValue = variables0.get(command.get(1));
                else
                    firstValue = Long.valueOf(command.get(1));

                Long secondValue = 0L;
                if (command.size() == 3) {
                    if (command.get(2).matches("[a-zA-Z]+"))
                        secondValue = variables0.get(command.get(2));
                    else
                        secondValue = Long.valueOf(command.get(2));
                }

                switch (command.get(0)) {

                    case "set": {
                        variables0.put(command.get(1), secondValue);
                        i0++;
                        continue;
                    }

                    case "add": {
                        variables0.put(command.get(1), firstValue + secondValue);
                        i0++;
                        continue;
                    }

                    case "mul": {
                        variables0.put(command.get(1), firstValue * secondValue);
                        i0++;
                        continue;
                    }
                    case "mod": {
                        variables0.put(command.get(1), firstValue % secondValue);
                        i0++;
                        continue;
                    }
                    case "snd": {
                        sent0.add(firstValue);
                        hold1 = false;
                        i0++;
                        continue;
                    }
                    case "rcv": {
                        if(sent1.size() > 0){
                            variables0.put(command.get(1), sent1.poll());
                            i0++;
                        }
                        else {
                            hold0 = true;
                        }
                        continue;

                    }
                    case "jgz": {
                        if (firstValue > 0)
                            i0 += secondValue;
                        else
                            i0++;
                    }
                }
            }

            while (!hold1 && i1 < commands.size()) {

                List<String> command = commands.get(i1.intValue());

                Long firstValue = 0L;
                if (command.get(1).matches("[a-zA-Z]+"))
                    firstValue = variables1.get(command.get(1));
                else
                    firstValue = Long.valueOf(command.get(1));

                Long secondValue = 0L;
                if (command.size() == 3) {
                    if (command.get(2).matches("[a-zA-Z]+"))
                        secondValue = variables1.get(command.get(2));
                    else
                        secondValue = Long.valueOf(command.get(2));
                }

                switch (command.get(0)) {

                    case "set": {
                        variables1.put(command.get(1), secondValue);
                        i1++;
                        continue;
                    }

                    case "add": {
                        variables1.put(command.get(1), firstValue + secondValue);
                        i1++;
                        continue;
                    }

                    case "mul": {
                        variables1.put(command.get(1), firstValue * secondValue);
                        i1++;
                        continue;
                    }
                    case "mod": {
                        variables1.put(command.get(1), firstValue % secondValue);
                        i1++;
                        continue;
                    }
                    case "snd": {
                        sent1.add(firstValue);
                        hold0 = false;
                        i1++;
                        program1SentValue++;
                        continue;
                    }
                    case "rcv": {
                        if(sent0.size() > 0){
                            variables1.put(command.get(1), sent0.poll());
                            i1++;
                        }
                        else {
                            hold1 = true;
                        }

                    }
                    case "jgz": {
                        if (firstValue > 0)
                            i1 += secondValue;
                        else
                            i1++;
                    }
                }

            }

            if((hold0 || i0 >= commands.size()) && (hold1 || i1 >= commands.size()))
                break;
        }

        System.out.print(program1SentValue);
    }

    private void readCommands() {
        for (String line : inputList) {
            commands.add(Arrays.asList(line.split(" ")));
        }
    }

    private void initializeVariables() {
        for (List<String> command : commands) {

            if (!command.get(1).matches(("[a-zA-Z]+")))
                continue;

            variables0.put(command.get(1), 0L);

            if(command.get(1).equals("p"))
                variables1.put(command.get(1), 1L);
            else
                variables1.put(command.get(1), 0L);
        }
    }

}
