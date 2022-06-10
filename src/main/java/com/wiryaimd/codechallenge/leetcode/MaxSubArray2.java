package com.wiryaimd.codechallenge.leetcode;

public class MaxSubArray2 {

    // completed, nyontek digit kontl
    public static int maxSubArray(int[] nums) {

        // -2, 5, -2, 1, 10, -3
        // -2,1,-3,4,-1,2,1,-5,4

        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > sum && sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }


            if (sum > max){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 5, -2, 1, 10, -3};
        System.out.println(maxSubArray(arr));
    }

}
