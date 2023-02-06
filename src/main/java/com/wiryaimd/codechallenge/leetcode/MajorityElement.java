package com.wiryaimd.codechallenge.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int major = nums[0];
        int majorVal = 1;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer curr = map.get(nums[i]);
            if(curr == null){
                curr = 1;
            }else{
                curr += 1;
            }

            map.put(nums[i], curr);
            if(curr > majorVal){
                major = nums[i];
                majorVal = curr;
            }
        }
        return major;
    }
}
