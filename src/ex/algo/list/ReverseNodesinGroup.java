package ex.algo.list;

public class ReverseNodesinGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        reverseKGroup(head, 3);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        int counter = k;
        ListNode start = head, end = head, prev = null;
        while(counter!=1 && end != null){
            end = end.next;
            counter--;
            if(counter == 0){
                ListNode temp = start.next;
                revertGroup(start, end);
                if (prev != null) {
                    end.next = prev;
                }
                prev = end;
                start = temp;
                end = start;
            }
        }

        return head;
    }

    public static void revertGroup(ListNode start, ListNode end){
        ListNode current = start, prev = null, next;
        while(current != end){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }
}
