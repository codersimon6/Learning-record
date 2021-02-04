import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
         Arrays.sort(array);
        int n = array[array.length / 2];
        int count = 0;
        for (int i : array) {
            if (i == n) count++;
        }
        if (count > array.length / 2) return n;
        return 0;
    }
}