import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            int count = 0;
            while (k >= 5){
                int tem = k;
                while (tem % 5 == 0){
                    count++;
                    tem = tem/5;
                }
                k--;
            }
            System.out.println(count);
        }
    }
}