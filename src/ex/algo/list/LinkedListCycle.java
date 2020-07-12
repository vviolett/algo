package ex.algo.list;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        hasCycle(head);
    }
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(fast!= null && fast.next!= null){
            fast = head.next.next;
            slow = head.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
