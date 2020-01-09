package q_17_mergeList;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class q_17_mergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode root = temp ;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                temp.next= list2;
                list2 = list2.next;
            }else {
                temp.next= list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1!=null) temp.next = list1;
        if(list2!=null) temp.next = list2;

        return root.next;
    }
}
