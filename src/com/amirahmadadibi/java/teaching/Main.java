package com.amirahmadadibi.java.teaching;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("amir");
        linkedList.add("sina");
        linkedList.add("ali");
        linkedList.add("reza");

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(3));

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
