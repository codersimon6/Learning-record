package com.simon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] strings = sc.nextLine().split(" ");
            char[] A = strings[0].toCharArray();
            char[] B = strings[1].toCharArray();
            ArrayList<Character> listA = new ArrayList<>();
            ArrayList<Character> listB = new ArrayList<>();
            for (char c : B) {
                listB.add(c);
            }
            for (char c : A) {
                listA.add(c);
            }
            for (int i = 0; i < listB.size(); i++) {
                if (listA.contains(listB.get(i))) {
                    listA.remove(listA.get(listA.indexOf(listB.get(i))));
                    listB.remove(i);
                    i--;
                }
            }
            if (listB.isEmpty()) {
                System.out.println("Yes");
                break;
            } else {
                System.out.println("No");
            }
        }
    }
}