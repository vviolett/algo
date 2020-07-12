package ex.algo.list;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public int getVal(){
        return val;
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
