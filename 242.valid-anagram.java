/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] S = s.toCharArray(); //convert into ARRAYS
        char[] T = t.toCharArray();

        Arrays.sort(S);  //Sorting in A.O
        Arrays.sort(T);
        for(int i =0; i<s.length();i++){
            if(S[i]!=T[i]){ //Checking if number of letters are same in both arrays
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

