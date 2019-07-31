package Pingduoduo;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-28 15:02
 * @description: 两个数组
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();
        String[] arr = str.split(" ");
        String[] arr2 = str2.split(" ");
        long[] a = new long[arr.length];
        long[] b = new long[arr2.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(arr2[i]);
        }
        boolean flag = false;
        Arrays.sort(b);
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1]){
                if(i!=a.length-1){
                int nowA = i;
                for(int j = b.length-1; j>=0; j--){
                    if(a[nowA-1]<b[j]&&b[j]<a[nowA+1]){
                        a[nowA] = b[j];
                        flag = true;
                        break;
                        }
                    }
                }else{
                    int nowA = i;
                    for(int j = b.length-1; j>=0; j--){
                        if(a[nowA-1]<b[j]){
                            a[nowA] = b[j];
                            flag = true;
                            break;
                        }
                    }
                }
            }else{
                continue;
            }
        }
        if(flag){
        StringBuffer res = new StringBuffer();
        for(int i = 0;i < a.length-1;i++){
            res.append(a[i]);
            res.append(" ");
        }
        res.append(a[a.length-1]);
        System.out.println(res);
        }else{
            System.out.println("No");
        }
    }
}
