/**
给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。
例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。

现给定数字，请编写程序输出能够组成的最小的数。

输入描述:
每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空
格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
*/
import java.util.*;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(sc.nextInt());
        }
        for (int i = 1; i < 10; i++) {
            if(list.get(i) != 0){
                System.out.print(i);
                list.set(i,list.get(i)-1);
                break;
            }
        }
        for(int i = 0;i < 10;i ++){
            int count = list.get(i);
            while (count > 0){
                System.out.print(i);
                count --;
            }
        }
    }
}