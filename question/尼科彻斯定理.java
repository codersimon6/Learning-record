/**
验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
例如：
1^3=1
2^3=3+5
3^3=7+9+11
4^3=13+15+17+19
输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
本题含有多组输入数据。
输入描述:
输入一个int整数
输出描述:
输出分解后的string
示例1
输入
6
输出
31+33+35+37+39+41
*/


import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int m = scanner.nextInt();
                int s = m * m + 1 - m;  // a1
                int sum = m*m*m;
                while ( m > 1){   // 输出m -1 项
                    System.out.print(s);
                    System.out.print("+");
                    s = s + 2;
                    m--;
                }
                System.out.println(s); // 输出 m项
            }
        }
    }