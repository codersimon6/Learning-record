/**
给定一个数字arr，其中只有有两个数字出现了奇数次，其它数字都出现了偶数次，按照从小到大顺序输出这两个数。
输入描述:
输入包含两行,第一行一个整数n(1 <n<105)，代表数组arr的长度,第二行n个整数，代表数组arr,arr[i]为32位整数。
输出描述:
输出出现奇数次的两个数,按照从小到大的顺序。
*/




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            Stack<Integer> stack = new Stack<>();
            while (!list.isEmpty()) {
                int temp = list.remove(0);
                if (!stack.isEmpty() && stack.peek() == temp) {
                    stack.pop();
                } else stack.push(temp);
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
