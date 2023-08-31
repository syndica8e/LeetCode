/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>(); //Create HashMap comparing a Single STRING to LIST of Strings

        for ( String word : strs){ //to compare this List you need a loop i.e FOR
            char[] charArray = word.toCharArray(); //Take out each Character and form n ARRAY
            Arrays.sort(charArray); //Sort it
            String sortedWord = new String(charArray); //takes sorted CHAR array and turns it back into STRING = stores it in SortedWord

            if(!map.containsKey(sortedWord)){ //if map doesn't have Key , 
                map.put(sortedWord, new ArrayList<>()); // add it , sortedWord as KEY and new ArrayList to store Actual anagrams
            }

            map.get(sortedWord).add(word); //retrieves List from key associated with SortedWord key from map and adds the original 'word' to that list
        }
        return new ArrayList<>(map.values()); //Once loop is done, returns NEW ArrayList from map
    }
}
// @lc code=end