package stack;

import java.util.Stack;

public class Solution {
	//使用两个栈来实现一个队列，
	//push时 总是push到栈1
	//pop时，如果栈2为空，则将栈1全部存入栈2，这里栈经过了两次翻转就变成队列，然后判断栈2是否为空，不为空则进行pop
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(!stack2.isEmpty()) {
    		return stack2.pop();
    	}else {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    		if(stack2.isEmpty()) {
    			return -1;
    		}
    		return stack2.pop();
    	}
    }
}
