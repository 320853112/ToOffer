package q_08_twoStackToQueue;

import java.util.Stack;

public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //入栈则进入栈1
        stack1.push(node);
    }

    public int pop() {
        //出栈先判断，如果栈2有元素则，出栈，负责将栈1的都装到栈2再出栈
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
