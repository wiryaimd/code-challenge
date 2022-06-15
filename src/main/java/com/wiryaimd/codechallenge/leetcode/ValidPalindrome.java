package com.wiryaimd.codechallenge.leetcode;

public class ValidPalindrome {

    // ezz actually
    public static boolean validPalindrome(String s){
        String raw = s.toLowerCase().replaceAll("\s+|[^a-z0-9]", "");
        if (raw.length() == 0 || raw.length() == 1){
            return true;
        }

        boolean isPalindrome = false;

        int mid = raw.length() / 2;
        int mod = 0;
        if (raw.length() % 2 == 0){
            mod = 1;
        }

        for (int i = 1; i <= mid; i++) {
            if (raw.charAt(mid - i) == raw.charAt(mid + i - mod)){
                isPalindrome = true;
                continue;
            }
            isPalindrome = false;
            break;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {

        System.out.println(validPalindrome("0P"));
    }

}
