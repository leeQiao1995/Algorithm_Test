package Pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-28 13:09
 * @description: 分发巧克力
 */
public class DistributeChocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        int m = in.nextInt();
        int w[] = new int[m];
        for (int i = 0; i < m; i++) {
            w[i] = in.nextInt();
        }
        Arrays.sort(h);
        Arrays.sort(w);
        int count = 0;
        int temp = (int)1e9;
        int temp2 = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (w[i] >= h[j]) {
                    count++;
                    h[j] = temp;
                    w[i] = temp2;
                 }
            }

        }
        System.out.println(count);
    }
}
