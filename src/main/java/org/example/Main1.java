package org.example;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        int[] array = {3,5,6,2,1,8,4,9,7,0};

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer i:array) {
            treeSet.add(i);
        }
        System.out.println(treeSet);
    }
}
