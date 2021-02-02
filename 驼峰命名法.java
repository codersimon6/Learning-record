package com.simon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.next();
            func(string);
        }
    }

    private static void func(String str) {

        while (str.contains("_")) {
            int index = str.indexOf("_");
            String temp = String.valueOf(str.charAt(index + 1));
            str = str.substring(0, index) + temp.toUpperCase() + str.substring(index + 2);
        }
        System.out.println(str);
    }
}
