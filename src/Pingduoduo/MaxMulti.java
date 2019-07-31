package Pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-27 20:28
 * @description: 乘积最大
 */
public class MaxMulti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long multi1 = arr[n-1]*arr[n-2]*arr[n-3];
        long multi2 = arr[n-1]*arr[0]*arr[1];
        if(multi1>multi2){
            System.out.println(multi1);
        }else{
            System.out.println(multi2);
        }
    }
}
