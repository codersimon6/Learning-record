/**
输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。

输出描述:
输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%
（四舍五入取整）。

输入
10 a
输出
aaaaaaaaaa
a        	a
a        	a
a        	a
aaaaaaaaaa
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        String c = sc.next();
        int line = col / 2;
        if (col % 2 != 0) {
            line = col / 2 + 1;
        }
        for(int i = 0;i < line;i++) {
            if(i == 0 || i == line-1){
                for (int j = 0; j < col; j++) {
                    System.out.print(c);
                }
            }else{
                for (int j = 0; j < col; j++) {
                    if(j == 0 || j == col -1 ) {
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}