package com.wiryaimd.codechallenge.leetcode;

public class SingleNumber {

    public static int singleNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2,4,3,3}));

        /**
         * 0100 // 4
         * 0010 // 2
         * = 0110 // 6 X
         *
         * 0110 // 6
         * 0010 // 2
         * = 0100 // 4 X
         *
         * 0100 // 4
         * 0001 // 1
         * = 0101 // 5 X
         *
         * 0101 // 5
         * 0001 // 1
         * = 0100 // 4
         *
         */


        String a = "  s 0032          ";
        for(String r : a.split("\s+")){
            System.out.println("data:" + r);
        }
    }

}
