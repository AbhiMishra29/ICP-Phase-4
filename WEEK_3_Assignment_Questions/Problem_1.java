//Leetcode problem: 2073. Time Needed to Buy Tickets
//Submission Link:https://leetcode.com/problems/time-needed-to-buy-tickets/submissions/1898432484/?envType=problem-list-v2&envId=queue

package WEEK_3_Assignment_Questions;

import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<tickets.length; i++){
            q.add(i);
        }

        int time = 0;
        while(!q.isEmpty()){
            int x = q.remove();
            tickets[x]--;
            time++;
            if(x==k && tickets[x]==0){
                return time;
            }
            if(tickets[x]!=0){
                q.add(x);
            }
        }
        return time;
    }
}