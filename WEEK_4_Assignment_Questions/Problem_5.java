package WEEK_4_Assignment_Questions;
// Problem no: 2289. Steps to Make Array Non-decreasing  
//Submission link: https://leetcode.com/problems/steps-to-make-array-non-decreasing/submissions/1909980898/

import java.util.*;
class Solution {
    public int totalSteps(int[] nums) {
        int ans = 0;
        Stack<int[]> st = new Stack<>();
        int n = nums.length;
        for(int i = n-1; i>=0; i--){
            int cnt = 0;
            while(!st.isEmpty() && st.peek()[0]<nums[i]){
                cnt = Math.max(cnt+1, st.peek()[1]);
                st.pop();
            }
            ans = Math.max(ans, cnt);
            st.push(new int[]{nums[i],cnt});
        }
        return ans;
    }
}
