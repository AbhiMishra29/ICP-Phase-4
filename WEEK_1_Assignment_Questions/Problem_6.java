// Problem Name: Median of Two Sorted Arrays
// Problem no.: 4
//Submission Link: https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/1884546878/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int idx1 = (m+n)/2;
        int idx2 = idx1 - 1;
        int ele1 = -1;
        int ele2 = -1;
        int cnt = 0;
        int i = 0, j = 0;
        while(i<m && j<n && cnt<=idx1){
            if(nums1[i]<nums2[j]){
                if(cnt==idx1) ele1 = nums1[i];
                if(cnt==idx2) ele2 = nums1[i];
                i++;
                cnt++;
            }
            else{
                if(cnt==idx1) ele1 = nums2[j];
                if(cnt==idx2) ele2 = nums2[j];
                j++;
                cnt++;
            }
        }
        while(i<m && cnt<=idx1){
            if(cnt==idx1) ele1 = nums1[i];
            if(cnt==idx2) ele2 = nums1[i];
            cnt++;
            i++;
        }
        while(j<n && cnt<=idx1){
            if(cnt==idx1) ele1 = nums2[j];
            if(cnt==idx2) ele2 = nums2[j];
            cnt++;
            j++;
        }

        if((m+n)%2==1){
            return (double)ele1;
        }
        else {
            return (double)(ele1+ele2)/2.0;
        }
    }
}