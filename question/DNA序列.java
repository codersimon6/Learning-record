/**
一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。
给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出GC-Ratio最高的子序列。

本题含有多组样例输入。
输入描述:
输入一个string型基因序列，和int型子串的长度
输出描述:
找出GC比例最高的子串,如果有多个输出第一个的子串
示例1
输入
AACTGTGCACGACCTGA
5
输出
GCACG
*/

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        int count = sc.nextInt();
        int maxcount = 0;
        String maxratio = null;
        //逐个遍历，保存当前最大的。相同则不存，保证第一的位置。
        for(int i = 0;i < c.length;i++){
            String s = Arrays.toString(Arrays.copyOfRange(c, i, i+count));
            int temp = ratio(s);
            if(temp > maxcount){
                maxcount = temp;
                maxratio = s;
            }
        }
        System.out.println(maxratio.replace(",","").replace("[","")
                .replace("]","").replace(" ",""));
    }

    public static int ratio(String s){
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'G' || s.charAt(i) == 'C' )count++;
        }
        return count;
    }
}