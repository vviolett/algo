package ex.algo.list;

import java.util.function.Predicate;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        reverseBetween(head, 1, 2);
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n)
            return head;

        ListNode current = head, previous = null;
        for (int i = 0; current != null && i < m - 1; ++i) {
            previous = current;
            current = current.next;
        }
        ListNode lastNodeOfFirstPart = previous;
        ListNode lastNodeOfSubList = current;
        ListNode next = null;
        for (int i = 0; current != null && i < n - m + 1; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        if (lastNodeOfFirstPart != null)
            lastNodeOfFirstPart.next = previous;
        else
            head = previous;

        lastNodeOfSubList.next = current;

        return head;
    }
}
