package q_15_findKthToTail;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return head;
        ListNode currNode = head;
        ListNode resNode = head;
        while(currNode.next!=null){
            if(k>1){
                k--;
            }else {
                resNode = resNode.next;
            }
            currNode = currNode.next;
        }
        if(k!=1) throw new RuntimeException("param k error!");

        return resNode;
    }
}
