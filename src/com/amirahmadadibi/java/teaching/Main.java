package com.amirahmadadibi.java.teaching;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> usernamesSet = new HashSet<>();

        usernamesSet.add("Amirahmad");
        usernamesSet.add("Ariana");
        usernamesSet.add("sina");
        usernamesSet.add("saman");

        for (String username : usernamesSet) {
            System.out.println("user is "+username);
        }


    }
}
