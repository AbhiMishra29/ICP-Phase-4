package WEEK_3_Assignment_Questions;

//Leetcode problem: 3589.  Count Prime-Gap Balanced Subarrays
// Submission Link: https://leetcode.com/problems/count-prime-gap-balanced-subarrays/submissions/1901261764/

import java.util.*;

class Solution {

    static final int N = 5 * 10000 + 1;
    static boolean[] sieve = new boolean[N];

    static {
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        for (int i = 2; i * i < N; i++) {
            if (!sieve[i]) continue;
            for (int j = i * i; j < N; j += i) {
                sieve[j] = false;
            }
        }
    }

    public int primeSubarray(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> maxval = new ArrayDeque<>();
        Deque<Integer> minval = new ArrayDeque<>();
        Deque<Integer> plist  = new ArrayDeque<>();

        int l = 0;
        int cnt = 0;

        for (int r = 0; r < n; r++) {
            int x = nums[r];

            if (x < N && sieve[x]) {
                plist.addLast(r);

                while (!maxval.isEmpty() && nums[maxval.peekLast()] < x) {
                    maxval.pollLast();
                }
                maxval.addLast(r);

                while (!minval.isEmpty() && nums[minval.peekLast()] > x) {
                    minval.pollLast();
                }
                minval.addLast(r);

                while (plist.size() >= 2 &&
                       !maxval.isEmpty() &&
                       !minval.isEmpty() &&
                       nums[maxval.peekFirst()] - nums[minval.peekFirst()] > k) {

                    if (nums[l] < N && sieve[nums[l]]) {
                        plist.pollFirst();
                        if (!maxval.isEmpty() && maxval.peekFirst() == l) {
                            maxval.pollFirst();
                        }
                        if (!minval.isEmpty() && minval.peekFirst() == l) {
                            minval.pollFirst();
                        }
                    }
                    l++;
                }
            }

            if (plist.size() >= 2 &&
                nums[maxval.peekFirst()] - nums[minval.peekFirst()] <= k) {

                int index = getSecondLast(plist);
                cnt += (index - l + 1);
            }
        }

        return cnt;
    }

    private int getSecondLast(Deque<Integer> dq) {
        Iterator<Integer> it = dq.descendingIterator();
        it.next();          
        return it.next();  
    }
}