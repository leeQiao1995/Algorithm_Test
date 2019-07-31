package Pingduoduo;

import java.util.Scanner;

/**
 * @author: jiao.li
 * @create: 2019-07-26 19:04
 * @description: 最小回合数
 */
public class MinRounds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hp = Integer.parseInt(in.nextLine());
        int normalAttack = Integer.parseInt(in.nextLine());
        int buffedAttack = Integer.parseInt(in.nextLine());
        int minRounds = 0;
        if(buffedAttack>2*normalAttack){
            int  temp = hp;
            while(temp>0){
                if(temp>normalAttack){
                    temp = temp-buffedAttack;
                    minRounds=minRounds+2;
                }else{
                    temp = temp-normalAttack;
                    minRounds++;
                }
            }
        }else{
            int temp2 = hp;
            while(temp2>0){
                temp2 = temp2-normalAttack;
                minRounds++;
            }
        }
        System.out.println(minRounds);

    }

}
