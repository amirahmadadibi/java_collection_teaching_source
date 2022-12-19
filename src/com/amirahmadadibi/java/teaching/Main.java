package com.amirahmadadibi.java.teaching;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> userGrades = new HashMap<>();

        userGrades.put("AmirahmadAdibi",19.80);
        userGrades.put("SinaSalvand",17.50);

        System.out.println(userGrades.get("SinaSalvand"));

        userGrades.remove("SinaSalvand");
    }
}
