package Pingduoduo;

import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-28 16:36
 * @description:
 */
public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();
        String[] arr = str.split(" ");
        String[] arr2 = str2.split(" ");
        int[] A = new int[arr.length];
        int[] B = new int[arr2.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(arr2[i]);
        }

        System.out.println(judge(A, B));
    }

    private static String judge(int[] A, int[] B){

        if (A.length == 0 || B.length == 0)
            return "NO";

        int a=0,b=0,c=0;

        for (int i=1; i < A.length; i++){
            if (A[i]<A[i-1]){
                if (i != A.length - 1){
                    a=A[i-1];
                    b=A[i+1];
                    c=i;
                }else{
                    c = i;
                    a = A[i-1];
                    b = Integer.MAX_VALUE;
                }
            }
        }
        int res = 0;
        for(int i=0;i<B.length;i++){

            if (B[i] > a && B[i] < b && B[i] > res)
                res = B[i];
        }
        if (res == 0)
            return "NO";
        else{
            A[c] = res;
        }

        StringBuffer str = new StringBuffer();
        for (int i=0;i<A.length;i++){
            str.append(A[i]);
            str.append(" ");
        }
        return str.toString();
    }
}
