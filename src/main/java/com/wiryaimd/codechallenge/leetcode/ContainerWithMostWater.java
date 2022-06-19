package com.wiryaimd.codechallenge.leetcode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;

        while (left < right){
            int distance = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, distance);

            if (height[left] > height[right]){
                right -= 1;
            }else{
                left += 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
//        int s = maxArea(new int[]{1,2,1});
//        int s = maxArea(new int[]{1,2,1});

        System.out.println(maxArea(new int[]{1,2,1}));
        System.out.println(maxArea(new int[]{55,5,22,12}));
    }
}

