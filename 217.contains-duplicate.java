/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>(); //HASHSET
        for (int i =0; i< nums.length; i++){
            if(set.contains(nums[i])){ //Contains method
                return true; //returns true if it finds a duplicate and PROGRAM STOPS here, since it has "return" statement
            }else{
                set.add(nums[i]);  //if it doesn't contain DUPLICATE , it adds it into HASHSET for next comparision
            }
        }
        return false; //if it finds any duplicate it returns true and this is skipped , if not this is RUN and it returns false
    }
}
// @lc code=end

