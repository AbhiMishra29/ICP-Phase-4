package WEEK_3_Assignment_Questions;

//Leetcode problem: 950. Reveal Cards In Increasing Order
// Submission Link: https://leetcode.com/problems/reveal-cards-in-increasing-order/submissions/1899618685/

import java.util.*;
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = n-1; i>=1; i--){
            q.add(deck[i]);
            int x = q.remove();
            q.add(x);
        }
        int i = n-1;
        while(!q.isEmpty() && i!=0){
            deck[i]=q.remove();
            i--;
        }

        return deck;
    }
}