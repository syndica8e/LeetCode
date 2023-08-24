/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        for (int i =0; i<nums.length;i++){
            int remaining_number = target - nums[i]; //9-2 = 7

            for( int j = 0; j<nums.length;j++){ // Second FOR loop to Check if this REM really exists in GIVEN Array
                if(remaining_number == nums[j] && i!=j ){  // ## i , j should be diff else TEST cases will fail for [3,3] target =6 , since here without i!=j it shows [1,1] instead of [0,1]
                    output[0]=i; //storing index of 1st number
                    output[1]=j; //storing index of REM i.e 2nd number we got from 2nd FOR loop
                }
            }
        }
        Arrays.sort(output); //sorting to get in A.O like Expected Answer
        return output; //printing OUTPUT array
    }
}
// @lc code=end

