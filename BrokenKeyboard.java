import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出肯定坏掉的那些键。
 *
 * 输入描述:
 * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
 * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
 *
 * 输出描述:
 * 按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
 * 示例1
 * 输入
 * 7_This_is_a_test<br/>_hs_s_a_es
 * 输出
 * 7TI
 */
public class BrokenKeyboard {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();  //存实际输入，也就是好的键
        ArrayList<Character> result = new ArrayList<>();  //坏键列表
        Scanner sc = new Scanner(System.in);
        String want1 = sc.nextLine();
        String cur1 = sc.nextLine();
        char [] want = want1.toUpperCase().toCharArray(); //存期望输入数组
        char [] cur = cur1.toUpperCase().toCharArray();  
        for(int k = 0;k < cur.length;k++){
            set.add(cur[k]);  
        }
        int j = 0;
        while (j < want.length){   // 遍历期望输出数组
            if(set.contains(want[j])){	  //如果是好的键，跳过
                j++;
            }
            else if(result.contains(want[j])) {  //如果坏键保存过，跳过
                j++;
            }else {     // 否则加入坏键列表
                result.add(want[j]);
                j++;
            }

        }
        for(char a:result) {
            System.out.print(a);
        }
        set.clear();
        result.clear();
    }
}