package com.wiryaimd.codechallenge.leetcode;

import java.math.BigInteger;

public class PlusOne {

    public static int[] plusOne(int[] digits){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < digits.length; i++){
            sb.append(digits[i]);
        }

        BigInteger bi = new BigInteger(sb.toString());
        bi = bi.add(new BigInteger("1"));

        String[] raw = bi.toString().split("");
        int[] result = new int[raw.length];
        for(int i = 0; i < result.length; i++){
            result[i] = Integer.parseInt(raw[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for(int a : plusOne(arr)){
            System.out.print(a);
        }

        System.out.println();
        System.out.println(Math.pow(3, 3));
    }

}
