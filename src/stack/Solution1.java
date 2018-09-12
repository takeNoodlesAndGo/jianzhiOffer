package stack;

import java.util.Stack;

public class Solution1 {
	//给出压入栈的序列，再给出栈的顺序，判断出栈的顺序是否符合压入栈的顺序
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack = new Stack<Integer>();
    	if(pushA==null||popA==null||pushA.length!=popA.length) {
    		return false;
    	}
    	int i =0,j=0;
    	for(;i<=pushA.length&&j<=popA.length;) {
    		if(i==pushA.length) {//说明全部push，检测栈顶和pop元素是否相同，如果不相同，则肯定false，如果全部相同，则为true
    			while(!stack.isEmpty()) {
    				if(stack.pop()!=popA[j]) {
    					return false;
    				}
    				j++;
    			}
    			return true;
    		}
    		if(stack.isEmpty()) {//为空时直接push
    			stack.push(pushA[i]);
    			i++;
    		}else {
    			if(stack.peek()==popA[j]) {//栈顶元素与当前元素相同时，pop，j++
    				stack.pop();
    				j++;
    			}else {
    				stack.push(pushA[i]);//不相同时只能push，i++
    				i++;
    			}
    		}
    	}
    	if(stack.isEmpty()) {//算是多此一举
    		return true;
    	}
    	return false;
    }
}
