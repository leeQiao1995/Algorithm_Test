/**
 * @author: jiao.li
 * @create: 2019-07-21 20:42
 * @description: 环的入口
 */
public class EntryNodeOfLoop {
    public static void main(String[] args) {
        ListNode node0 =  new ListNode(0);
        ListNode node1 =  new ListNode(1);
        ListNode node2 =  new ListNode(2);
        ListNode node3 =  new ListNode(3);
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
//        node3.next=node1;
        EntryNodeOfLoop e = new EntryNodeOfLoop();
        System.out.println(e.findEntry(node0));
    }
    public ListNode findEntry(ListNode pHead){
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
            if(fast == null||fast.next == null){
                return null;
            }
            fast = pHead;
            while (fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;

        }
    }


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}