package com.amirahmadadibi.java.teaching;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> usernameStack = new Stack<>();

        usernameStack.push("amir");
        usernameStack.push("ali");
        usernameStack.push("sina");

        System.out.println(usernameStack.empty());
    }
}
