package com.wiryaimd.codechallenge.leetcode;

public class BestTimeToBuyStock {

    // o n time complexity
    // nice problem
    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int minDay = Integer.MAX_VALUE;

        int max = 0;

        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                minDay = i;
                max = 0;
            }

            if(prices[i] > max && i > minDay){
                max = prices[i];
            }

            int sum = max - min;
            if(sum > maxProfit){
                maxProfit = sum;
            }
        }

        return Math.max(maxProfit, 0);
    }

    public static void main(String[] args) {
        int[] prices = {8,2,10,1,5,6};
        int[] prices2 = {7,6,4,3,1};
        int[] prices3 = {7,6,4,4,3};
        int[] prices4 = {7,6,4,4,1};
        System.out.println(maxProfit(prices4));
    }

}
