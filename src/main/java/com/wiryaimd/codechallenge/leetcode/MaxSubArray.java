package com.wiryaimd.codechallenge.leetcode;


public class MaxSubArray {

    // time limit anjeg
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]){
                max = nums[i];
            }

            if (nums[i] < 0){
                continue;
            }

            int count = 0, numEach = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                if (numEach < count && nums[j] > 0){
                    numEach = count;
                }
            }

            if (max < numEach){
                max = numEach;
            }
        }
        return max;
    }

    public static void main(String[] args) {


        System.out.println(maxSubArray(new int[]{-2,4,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(maxSubArray(new int[]{10, -2, -6, -3, 10, -3, 4}));
        System.out.println(maxSubArray(new int[]{-2, -1}));
        System.out.println(maxSubArray(new int[]{-2, -1, 1, 2, -3, 3, -1, 3, -1, 7}));
        System.out.println(maxSubArray(new int[]{-2, -1}));
        System.out.println(maxSubArray(new int[]{-2, -1}));
    }

}
