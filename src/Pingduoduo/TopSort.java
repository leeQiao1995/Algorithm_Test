package Pingduoduo;

/**
 * @author: jiao.li
 * @create: 2019-07-28 21:04
 * @description:
 */
import java.util.*;

public class TopSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        int dep = sc.nextInt();
        int[] time = new int[task + 1];
        for (int i = 1; i < time.length; i++) {
            time[i] = sc.nextInt();
        }
        int[][] tmp = new int[dep][2];
        for (int i = 0; i < dep; i++) {
            for (int j = 0; j < 2; j++) {
                tmp[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[] nums = new int[task + 1];
        for (int[] num : tmp) {
            nums[num[1]]++;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((e1, e2) -> time[e1] - time[e2]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                queue.offer(i);
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            list.add(cur);
            for (int[] p : tmp) {
                if (p[0] == cur) {
                    nums[p[1]]--;
                    if (nums[p[1]] == 0) {
                        queue.offer(p[1]);
                    }
                }
            }
        }
        if (list.size() == task) {
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    System.out.println(list.get(i));
                    break;
                }
                System.out.print(list.get(i) + " ");
            }
        }

    }
}

