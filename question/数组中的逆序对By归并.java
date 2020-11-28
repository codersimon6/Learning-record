/**
给定一个int数组A和它的大小n，对于这组数能组成的任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。请设计一种高效的算法返回A中存在的逆序对个数。要求n不大于5000。

测试样例：
[1,2,3,4,5,6,7,0],8
返回：7
*/

import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        return  mergeHelp(A,0,n-1);
    }
    
    public static int mergeHelp(int[] a,int l ,int r){
        if(l == r)return 0;
        int mid = (l+r)/2;
        return mergeHelp(a,l,mid)+mergeHelp(a,mid+1,r)+merge(a,l,mid,r);
    }
    public static int merge(int[] a,int l,int mid ,int r){
        int[] temp = new int[r-l+1];
        int index = 0;
        int low = l;
        int high = mid+1;
        int count = 0;
        while(low <= mid && high <= r){
            if(a[low] < a[high]){
                temp[index++] = a[low++];
            }else {
                count = count +(mid - low + 1);
                temp[index++] = a[high++];
            }
        }
        while(low <= mid){
            temp[index++] = a[low++];
        }
        while(high <= r){
            temp[index++] = a[high++];
        }
        for(int i = 0;i < temp.length;i++){
            a[l++] = temp[i];
        }
        return count;
    }
}