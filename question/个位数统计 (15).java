/**
给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
*/

public class Main{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int num[]=new int[10];
        for(char c : s.toCharArray()){
            num[c-'0']++;
        }
        for(int i = 0;i<10;i++){
            if(num[i] != 0)
                System.out.println(i+":"+num[i]);
        }
    }
}