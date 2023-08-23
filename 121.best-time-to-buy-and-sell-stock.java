/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for ( int i =0 ; i< prices.length;i++){
            for(int j =i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit >max_profit){
                    max_profit = profit;
                }
            }
        }return max_profit;
}
}
// @lc code=end

