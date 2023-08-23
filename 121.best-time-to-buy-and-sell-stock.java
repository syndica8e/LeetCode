/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int small = Integer.MAX_VALUE; //[2,4,1]  [7,4,3,1,2], small =2147483647
        int profit = 0;
        int max_profit=0;
        for ( int i = 0 ; i < prices.length; i++){
            if(prices[i]<small){
                small = prices[i]; //[0] 2 , 7 = small ;[1] small=4
            }
            profit = prices[i] - small; //profit = 0 ;4-2 =2;
            if(max_profit < profit){
                max_profit = profit;
            }
        } return max_profit;
}
}
// @lc code=end

