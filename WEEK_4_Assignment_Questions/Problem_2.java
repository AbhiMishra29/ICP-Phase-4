package WEEK_4_Assignment_Questions;
// Problem No: 2095. Delete the Middle Node of a Linked List
//Submission Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/submissions/1905104839/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode prevSlow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevSlow.next = slow.next;
        return head;
    }
}
