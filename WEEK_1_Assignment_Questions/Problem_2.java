// Problem Name: Find the Index of the First Occurrence in a String
// Problem no.: 28
//Submission Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1884029185/

class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for(int i = 0; i < m - n + 1; i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}