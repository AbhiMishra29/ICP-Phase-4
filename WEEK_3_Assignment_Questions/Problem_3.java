package WEEK_3_Assignment_Questions;

//Leetcode problem: 3191. Minimum Operations to Make Binary Array Elements Equal to One I
// Submission Link: https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/submissions/1899432528/

class Solution {
    public int minOperations(int[] nums) {
        int minOpr = 0;
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            if(nums[i]==0){
                minOpr++;
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1; 
            }
        }

        if(nums[n-1]==1 && nums[n-2]==1) return minOpr;
        return -1;
    }
}