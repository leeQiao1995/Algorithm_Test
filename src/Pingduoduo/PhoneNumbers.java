package Pingduoduo;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-27 12:46
 * @description: 选靓号
 */
public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        String phoneNum = in.next();
        StringBuffer ans = null;
        int cost = (int) 1e9;
        for (int i = 0; i < 10; i++) { //变成后的那个数字
            StringBuffer newNum = new StringBuffer(phoneNum);
            int count = K;
            int nowCost = 0;
            for (int j = 0; j < 10; j++) { // j = 花费
                for (int l = 0; l < N; l++) {
                    if (count!=0 && newNum.charAt(l) - '0' == i + j) {
                        nowCost = nowCost + j;
                        newNum.setCharAt(l, (char) (i + '0'));
                        count--;
                    }
                }

                if (j != 0) {
                    for (int l = N - 1; l >= 0; l--) {
                        if (count != 0 && newNum.charAt(l) - '0' == i - j) {
                            nowCost = nowCost + j;
                            newNum.setCharAt(l, (char) (i + '0'));
                            count--;
                        }
                    }
                }

            }
            if (nowCost < cost) {
                cost = nowCost;
                ans = newNum;
            }
        }
            System.out.println(cost);
            System.out.println(ans);
    }
}
