/**
Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
*/

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int m = sc.nextInt();
            int f0 = 0;
            int f1 = 1;
            int count = 0;
            if(m == 1 || m == 0){
                System.out.println(count);
                return;
            }
            while (f1 < m){
                int tem = f0+f1;
                f0 = f1;
                f1 = tem;
            }
            count = ((f1 - m) < (m - f0)) ? f1 - m : m - f0;
            System.out.println(count);
        }
    }
}