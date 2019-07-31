package Pingduoduo;

import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-27 15:22
 * @description:
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String s = scanner.next();
        StringBuffer ans = null;
        int res = (int) 1e9;
        for (int i = 0; i < 10; i++) { //改变后的数字
            StringBuffer t = new StringBuffer(s);
            int p = K, c = 0;
            for (int j = 0; j < 10; j++) { //变成那个数字需要的花费
                for (int l = 0; l < N; l++) {
                    if (p != 0 && t.charAt(l) - '0' == i + j) { //数字-花费，从前往后插
                        p--;
                        t.setCharAt(l, (char) (i + '0'));
                        c = c + j;
                    }
                }
                if (j != 0)
                    for (int l = N - 1; l >= 0; l--)
                        if (p != 0 && t.charAt(l) - '0' == i - j) { //数字+花费，从后往前插
                            p--;
                            t.setCharAt(l, (char) (i + '0'));
                            c = c + j;
                        }
            }
            if (c < res) {
                res = c;
                ans = t;
            }
        }
        System.out.println(res);
        System.out.println(ans);
    }
}
