/**
*字符串中找出连续最长的数字串
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            String[] s = str.split("[^0-9]");
            int max = 0;
            for(int i = 0;i < s.length;i++){
                max = max > s[i].length() ? max : s[i].length();
            }
            for(String ss1 : s){
                if(ss1.length() == max){
                    System.out.println(ss1);
                }
            }
        }
    }
}