// Problem Name: First Missing Positive
// Problem no.: 41
//Submission Link: https://leetcode.com/problems/first-missing-positive/submissions/1884694925/

import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i<=n; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return n+1;
    }
}