package Pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-27 17:19
 * @description:
 */
public class MinDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int sum[] = new int[n/2];
        for(int i = 0;i < n/2; i++){
            sum[i]=arr[i]+arr[n-1-i];
        }
        Arrays.sort(sum);
        System.out.println(sum[n/2-1]-sum[0]);
    }
}
