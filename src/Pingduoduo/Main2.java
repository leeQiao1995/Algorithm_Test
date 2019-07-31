package Pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-28 15:52
 * @description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] length = new int[n];
        int[] weight = new int[n];
        for(int i = 0; i < n; i++){
            length[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }
        int[][] arr = new int[2][n];
        for(int i = 0;i < n;i ++){
            arr[0][i] = length[i];
            arr[1][i] = weight[i];
        }

        int nowWeight = 0;
        int count = 0;
        System.out.println(count);
    }
}
