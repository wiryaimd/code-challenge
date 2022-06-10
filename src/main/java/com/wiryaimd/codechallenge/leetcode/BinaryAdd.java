package com.wiryaimd.codechallenge.leetcode;

public class BinaryAdd {

    // need big integer
    public static String addBinary(String a, String b){
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);;
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
