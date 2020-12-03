

import java.util.*;

public class Main{
    static int[] a;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(choose(n,40));
    }
    public static int choose(int i,int sum){
        if(sum == 0)return 1;
        if(sum > 0 && i < 1)return 0;
        if(sum < 0)return 0;
//从后往前装，装上weight[n]后，若剩余物品仍然有解则choose(i-1,sum-a[i-1]);
//若装了weight[n]后，无解，则跳过n,尝试第n-1个choose(sum,n-1);
        return choose(i-1,sum-a[i-1]) + choose(i-1,sum);
    }
}