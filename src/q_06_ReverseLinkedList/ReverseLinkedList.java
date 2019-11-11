package q_06_ReverseLinkedList;

import java.util.ArrayList;
import java.util.Stack;

/**
 * description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 */

public class ReverseLinkedList {
    //栈实现
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack();
        ArrayList<Integer> arrayList = new ArrayList();
        ListNode nowNode = listNode;
        while (nowNode!=null){
            stack.push(nowNode);
            nowNode = nowNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }
    //递归实现
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//
//        printListFromTailToHead(listNode.next);
//
//    }
}

class ListNode {
       int val;
       ListNode next = null;
        ListNode(int val) {
           this.val = val;
       }
}