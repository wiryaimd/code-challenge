package com.wiryaimd.codechallenge.leetcode;

public class NumberPalindrome {

    public static boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int mid = (val.length() / 2);
        return val.substring(0, mid).equalsIgnoreCase(new StringBuilder(val.substring(val.length() % 2 == 0 ? mid : mid + 1)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100001));
        System.out.println(isPalindrome(1001001));
        System.out.println(isPalindrome(1001201));
        System.out.println(isPalindrome(1021201));
        System.out.println(isPalindrome(102201));
        System.out.println(isPalindrome(10232201));
        System.out.println(isPalindrome(10214201));
        System.out.println(isPalindrome(102141201));
    }
}
