package ex.algo.list;

public class MiddleoftheLinkedList876 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.println(middleNode(node).val);

    }

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode current = head;
        int i = 0;

        while(current.next != null){
            current = current.next;

            if(i%2 == 0){
                middle = middle.next;
            }
            i++;
        }

        return middle;

    }
}
