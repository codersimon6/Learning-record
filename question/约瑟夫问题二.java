/**
现有n个人围坐一圈，顺时针给大家编号，第一个人编号为1，然后顺时针开始报数。第一轮依次报1，2，1，2...没报1的人出局。接着第二轮再从上一轮最后一个报数的人开始依次报1，2，3，1，2，3...没报1的人都出局。以此类推直到剩下以后一个人。现给定一个int n，要求返回最后一个人的编号。
*/
import java.util.*;

public class Joseph {
    public int getResult(int n) {
        if (n < 1) return -1;
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int bound = 2; //第一次报数的步长
        int i, begin = 0; //i为报数人计数器。begin为每人报的数
        while (list.size() > 1) { //list剩一个元素退出
            i = 0;  //开始报数前，i置为0。
            while (list.size() > 1 && i < list.size()) {  //模拟报数，没报到1的人直接删除
                begin = (begin + 1) % bound;
                if (begin != 1) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            //题目：接着第二轮再从上一轮最后一个报数的人开始依次报
            //也就是，上一轮没被删除的最后一个，提到头，继续顺序报数
            int last = list.remove(list.size() - 1);
            list.add(0, last);
            begin = 0; //begin置0重新开始
            bound++; //下一轮报数的步长是上一轮+1
        }
        return list.get(0);
    }
}