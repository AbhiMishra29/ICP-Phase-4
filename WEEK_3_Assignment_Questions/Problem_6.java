package WEEK_3_Assignment_Questions;

//Leetcode problem: 1696. Jump Game VI
// Submission Link: https://leetcode.com/problems/jump-game-vi/submissions/1901157365/

import java.util.*;
class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> q = new ArrayDeque<>();
        int[] dp = new int[n];
        dp[n-1] = nums[n-1];
        q.addLast(n-1);

        for(int i = n-2; i>=0; i--){
            if(q.getFirst()-i > k) q.removeFirst();
            dp[i] = nums[i] + dp[q.getFirst()];
            while(q.size() > 0 && dp[q.getLast()]<dp[i]){
                q.removeLast();
            }
            q.addLast(i);
        }

        return dp[0];
    }
}