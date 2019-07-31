package Pingduoduo;


import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-26 20:24
 * @description: 贪心种树
 */
public class PlantTrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int treeType[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            treeType[i] = in.nextInt();
            sum = sum + treeType[i];
        }
        StringBuffer sout = new StringBuffer();
        if ((sum & 1) == 0) {
            for (int i = 0; i < n; i++) {
                if (treeType[i] > sum / 2)  System.out.println("-");
            }
        } else {
            for (int i = 0; i < n; i++){
                if (treeType[i] > (sum + 1) / 2) System.out.println("-");
            }
        }
        int temp = sum;//便于记数引入的变量
        int nowTree = -1;
        for(int i = 0;i < sum;i++){
            boolean flag = false;
            for(int j = 0; j < n;j++){
                if(treeType[j]>temp/2){
                    nowTree = j;
                    treeType[nowTree]--;
                    sout.append(nowTree+1);
                    sout.append(" ");
                    temp--;
                    flag = true;
                    break;
                }
            }
            if(flag == true) continue;
            int nextTree = 0;
            while( treeType[nextTree] ==0 || nextTree == nowTree){
                nextTree++;
            }
            sout.append(nextTree+1);
            sout.append(" ");
            treeType[nextTree]--;
            temp--;
            nowTree = nextTree;

        }
        System.out.println(sout.toString().trim());
    }
}
