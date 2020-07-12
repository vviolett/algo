package ex.algo.list;

public class StartLinkedListCycle {

    public static ListNode detectCycle(ListNode head) {
        int length = findCycleLength(head);
        if(length == 0) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(length != 0){
            fast = fast.next;
            length--;
        }
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        System.out.println("LinkedList cycle start: " + detectCycle(head));

    }
}
