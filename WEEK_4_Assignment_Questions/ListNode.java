package WEEK_4_Assignment_Questions;

// Problem no: 1290. Convert a Binary Number in a Linked List to an Integer
// Submission Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/1905067782/

import java.util.*;
 public class ListNode{
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        List <Integer> ll = new ArrayList<>();
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        for(int i = 0; i < ll.size();i++){
            sum += Math.pow(2,ll.size()-i-1)*ll.get(i);
        }
        return sum;
    }
}
