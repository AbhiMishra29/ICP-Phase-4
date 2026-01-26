// Problem Name: Best Time to Buy and Sell Stock
// Problem no.: 121
//Submission Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1884518014/

class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    int minBuy = prices[0];
    for(int i = 1; i<prices.length; i++){
        if(minBuy>prices[i]){
            minBuy = prices[i];
        }
        if(prices[i]-minBuy>profit){
            profit = prices[i]-minBuy;
        }
    }
    return profit;
  }
}