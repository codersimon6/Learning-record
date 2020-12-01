/**
二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。
*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println(fun(row, col));
        }
    }

    public static int fun(int row, int col) {
        //每四行四列一个轮回。
        int count = 0;
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            //处理第一二行
            if (i % 4 == 0 || i % 4 == 1) {
                for (int j = 0; j < col; j++) {
                    if (j % 4 == 0 || j % 4 == 1) {
                        a[i][j] = 1;
                        count++;
                    }
                }
            } else {
                //处理第二三行
                for (int j = 0; j < col; j++) {
                    if (j % 4 == 2 || j % 4 == 3) {
                        a[i][j] = 1;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}