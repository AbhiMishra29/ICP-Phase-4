package WEEK_4_Assignment_Questions;

//Problem no: 2816. Double a Number Represented as a Linked List
//Submission link: https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/submissions/1764582884/

import java.util.*;
class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }

        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        while(!st.isEmpty()){
            int mul = st.pop()*2 + carry;
            carry = mul/10;
            ListNode list = new ListNode(mul%10);
            dummy.next = list;
            dummy = dummy.next;
        }
        if(carry!=0){
            ListNode list = new ListNode(carry%10);
            dummy.next = list;
            dummy = dummy.next;
        }

        return reverse(ans.next);
    }

    public ListNode reverse(ListNode ans){
        ListNode curr = ans;
        ListNode prev = null;
        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
