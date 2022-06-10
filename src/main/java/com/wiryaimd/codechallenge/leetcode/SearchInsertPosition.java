package com.wiryaimd.codechallenge.leetcode;

public class SearchInsertPosition {

//    o log n yachh
    public int searchInsert(int[] nums, int target) {

        if(target < nums[0]){
            return 0;
        }

        int mid = -1;
        int start = 0, end = nums.length - 1;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if(target > nums[mid]){
            return mid + 1;
        }

        return mid;

    }

}
