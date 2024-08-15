package org.example;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        //initialize the hashmap of key integer and value integer
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        //add the base case
        map.put(0, 1);
        //iterate through the given array
        for (int num : nums) {
            //find the sum up to the current num
            sum += num;
            //check if the map has the key (sum - k)
            if (map.containsKey(sum - k)) {
                //add the value to the result
                result += map.get(sum - k);
            }
            //add the current sum and its frequency as the value to the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
