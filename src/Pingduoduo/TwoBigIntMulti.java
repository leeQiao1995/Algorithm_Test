package Pingduoduo;

import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-27 21:14
 * @description: 两个很大的整数相乘
 */
public class TwoBigIntMulti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int la = a.length();
        int lb = b.length();
        int[] res = new int[la+lb];
        for(int i = la-1; i>=0; i--){
            int aa = a.charAt(i)-'0';
            for(int j = lb-1; j>=0; j--){
                int bb = b.charAt(j)-'0';
                res[i+j] =res[i+j]+(res[i+j+1]+aa*bb)/10;
                res[i+j+1] = (res[i+j+1]+aa*bb)%10;

            }
        }
        String s="";
        for(int i=0;i<res.length;i++){
            if(i==0&&res[i]==0) continue;
            s+=res[i];
        }
        System.out.println(s);
    }
}
