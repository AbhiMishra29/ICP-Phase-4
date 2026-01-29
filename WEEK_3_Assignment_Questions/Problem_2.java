package WEEK_3_Assignment_Questions;
//Leetcode problem: 1823. Find the Winner of the Circular Game
//Submission Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/submissions/1898449998/

import java.util.*;
class Solution {
    public int findTheWinner(int n, int k) {
        int cnt = 1;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            q.add(i);
        }

        while(q.size()!=1){
            if(cnt%k==0){
                q.remove();
            }
            else{
                int x = q.remove();
                q.add(x);
            }
            cnt++;
        }
        return q.remove();
    }
}