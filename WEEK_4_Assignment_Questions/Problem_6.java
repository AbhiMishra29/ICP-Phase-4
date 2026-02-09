package WEEK_4_Assignment_Questions;
// Problem no: 1019. Next Greater Node In Linked List      
// Submission link: https://leetcode.com/problems/next-greater-node-in-linked-list/submissions/1885929212/

import java.util.*;
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        head = reverse(head,null);
        List<Integer> l = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        while(head!=null){
            while(!st.isEmpty() && head.val>=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                l.add(st.peek());
            }
            else{
                l.add(0);
            }
            st.push(head.val);
            head = head.next;
        }
        Collections.reverse(l);
        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }

    public ListNode reverse(ListNode curr, ListNode prev){
        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}