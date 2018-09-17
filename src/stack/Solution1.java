package stack;

import java.util.Stack;

public class Solution1 {
	//����ѹ��ջ�����У��ٸ���ջ��˳���жϳ�ջ��˳���Ƿ����ѹ��ջ��˳��
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack = new Stack<Integer>();
    	if(pushA==null||popA==null||pushA.length!=popA.length) {
    		return false;
    	}
    	int i =0,j=0;
    	for(;i<=pushA.length&&j<=popA.length;) {
    		if(i==pushA.length) {//˵��ȫ��push�����ջ����popԪ���Ƿ���ͬ���������ͬ����϶�false�����ȫ����ͬ����Ϊtrue
    			while(!stack.isEmpty()) {
    				if(stack.pop()!=popA[j]) {
    					return false;
    				}
    				j++;
    			}
    			return true;
    		}
    		if(stack.isEmpty()) {//Ϊ��ʱֱ��push
    			stack.push(pushA[i]);
    			i++;
    		}else {
    			if(stack.peek()==popA[j]) {//ջ��Ԫ���뵱ǰԪ����ͬʱ��pop��j++
    				stack.pop();
    				j++;
    			}else {
    				stack.push(pushA[i]);//����ͬʱֻ��push��i++
    				i++;
    			}
    		}
    	}
    	if(stack.isEmpty()) {//���Ƕ��һ��
    		return true;
    	}
    	return false;
    }
}
