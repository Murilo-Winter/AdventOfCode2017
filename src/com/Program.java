package com;

import java.util.*;

public class Program {

    public String name;

    public int weight = 0;

    public int totalWeight = 0;

    public ArrayList<String> childrenName = new ArrayList<>();

    public List<Program> children = new ArrayList<>();

    public Program parent;

    public boolean hasChildren(){
        return (childrenName.size() > 0);
    }

}
