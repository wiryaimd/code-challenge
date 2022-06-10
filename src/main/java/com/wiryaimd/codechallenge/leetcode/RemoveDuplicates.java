package com.wiryaimd.codechallenge.leetcode;

public class RemoveDuplicates {


    // fail kont
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length - k; i++){
            boolean isDup = false;
            int count = -1;
            for(int j = i + 1, m = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    isDup = true;
                    k += 1;

                    count += 1;
                }

                if(isDup && j + 1 + count < nums.length){
                    nums[m + count] = nums[m + 1 + count];
                }else{
                    m++;
                }
            }
        }

        for (int a : nums){
            System.out.println(a);
        }
        return nums.length - k;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

}
