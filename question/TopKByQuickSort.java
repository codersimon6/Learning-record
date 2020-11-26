/**
有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。

给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
*/



import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        return find(a,0,n-1,K);
    }
    
    public static int find(int[] a,int low,int high,int k){
        int index = getindex(a,low,high);
        if(index + 1 == k)return a[index];
        else if(index+1  < k)return find(a,index + 1, high, k);
        else return find(a,low,index-1,k);
    }
    
    public static int getindex(int[] a,int low,int high){
        int k = a[low];
        while(low < high){
            while(low < high && a[high] <= k){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] >= k){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = k;
        return low;
    }
}