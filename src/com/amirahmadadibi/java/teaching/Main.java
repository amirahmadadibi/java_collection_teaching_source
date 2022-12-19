package com.amirahmadadibi.java.teaching;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] userArray = new String[1000];

        List<String> userList = new ArrayList<>();
        userList.add("Amriahmad");
        userList.add("Ariana");

        System.out.println(userList.get(0));

    }
}
