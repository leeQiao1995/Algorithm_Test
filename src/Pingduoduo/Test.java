package Pingduoduo;
/**
 * @author: jiao.li
 * @create: 2019-07-26 21:03
 * @description:
 */
import java.util.Scanner;
//1、首先判断能不能种树。如果是奇数，如果某种树大于（M+1）的一半则不能种，如果是偶数，则大于M的一半不能种树
// 2、每次种树前都要判断是不是某种树大于一半，如果是，本次种该树。如果不是再从下网上遍历数组，优先种序号小的树（要保证该序号的树还有的剩，且不等于之前种的树）
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nums = new int[N];
        int M = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
            M += nums[i];
        }
        if (M % 2 == 0) {//如果是偶数
            for (int i = 0; i < N; i++) {
                if (nums[i] > M / 2) {
                    System.out.println("-");
                    return; } }
        } else {//如果是奇数
            for (int i = 0; i < N; i++) {
                if (nums[i] > (M + 1) / 2) {
                    System.out.println("-");
                    return; } } }
        StringBuffer res = new StringBuffer();
        int count = M;
        int pre = -1;
        for (int i = 0; i < M; i++) {
            boolean flag = false;
            for (int k = 0; k < N; k++) {
                if (nums[k] > count / 2) {//判断是否有树大于剩余的一半
                    res.append(k + 1);
                    res.append(" ");
                    nums[k]--;
                    pre = k + 1;
                    flag = true;
                    count--;
                    break;
                }
            }
            if (flag == true) continue;
            int j = 0;
            while (nums[j] == 0 || (j + 1) == pre) {
                j++;
            }
            nums[j]--;
            pre = j + 1;
            res.append(j + 1);
            res.append(" ");
            count--;
        }
        System.out.println(res.toString().trim());
    }
}
