package com.amirahmadadibi.java.teaching;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<>();

        Flyable flyableBird = new Canry();
        flyableBird.fly();
        Canry ca     = new Canry();
        Sparow sparow = new Sparow();
        sparow.fly();

    }

}
