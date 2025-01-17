package ex.algo.list;

public class MiddleoftheLinkedList876 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.println(middleNode(node).val);

    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null&&fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
