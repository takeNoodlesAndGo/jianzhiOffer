package complex;

import java.util.Stack;

import bean.ListNode;

public class Solution5 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> s1 = new Stack<ListNode>();
        Stack<ListNode> s2 = new Stack<ListNode>();
        while(pHead1!=null){
            s1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2!=null){
            s2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode node = null;
        int size1 = s1.size();
        int size2 = s2.size();
        for(int i=0;i<size1&&i<size2;i++){
            if(s1.peek()!=s2.peek()){
                return node;
            }else{
                node = s1.pop();
                s2.pop();
            }
        }
        return node;
    }
}
