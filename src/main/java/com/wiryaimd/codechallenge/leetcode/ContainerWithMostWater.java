package com.wiryaimd.codechallenge.leetcode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 1;
        int len = height.length - 1;

        int[] p1 = {1, 1};
        int[] p2 = {len, height[len]};

        for(int i = 0; i < height.length; i++){

            if((i + 1) * height[i] > p1[0] * p1[1]){
                p1[0] = i;
                p1[1] = height[i];
            }

            if(len - i * height[len - i] > p2[0] * p2[1]){
                p2[0] = len - i;
                p2[0] = height[len - i];
            }

            int sum = Math.min(p1[1], p2[1]) * (p2[0] - p1[0]);
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int s = maxArea(new int[]{1,2,1});
        System.out.println(s);
    }
}

