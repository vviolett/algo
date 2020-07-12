package ex.algo.list;

public class LinkedListCycleLength {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListCycleLength.findCycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListCycleLength.findCycleLength(head));
    }

    public static int findCycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return countCycleLength(slow);
            }
        }
        return 0;
    }

    public static int countCycleLength(ListNode slow){
        ListNode curr = slow.next;
        int count = 1;
        while(curr != slow){
            curr = curr.next;
            count++;
        }
        return count;
    }
}
