package com.simon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                StringBuilder temp = new StringBuilder(str);
                temp.deleteCharAt(str.length() - i - 1);
                if (fun(temp.toString())) {
                    System.out.println("YES");
                    break;
                }
                if (i == str.length() - 1) System.out.println("NO");
            }
        }
    }

    private static boolean fun(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
