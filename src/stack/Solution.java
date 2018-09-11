package stack;

import java.util.Stack;

public class Solution {
	//ʹ������ջ��ʵ��һ�����У�
	//pushʱ ����push��ջ1
	//popʱ�����ջ2Ϊ�գ���ջ1ȫ������ջ2������ջ���������η�ת�ͱ�ɶ��У�Ȼ���ж�ջ2�Ƿ�Ϊ�գ���Ϊ�������pop
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
