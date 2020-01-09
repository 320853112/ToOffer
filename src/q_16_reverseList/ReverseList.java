package q_16_reverseList;

//输入一个链表，反转链表后，输出新链表的表头。

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode curr = head;
        ListNode next = curr.next;
        curr.next=null;
        while (next!=null){
            ListNode temp =next.next;
            next.next = curr;
            curr = next;
            next = temp;
        }
        return curr;
    }
}
