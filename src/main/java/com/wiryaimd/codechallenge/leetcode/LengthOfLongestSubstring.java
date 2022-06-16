package com.wiryaimd.codechallenge.leetcode;

public class LengthOfLongestSubstring {

    // broo its medium level!!!
    // i can solve this shit
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.substring(curr, i).contains(String.valueOf(s.charAt(i)))){
                curr = curr + s.substring(curr, i).indexOf(s.charAt(i)) + 1;
                count = i - curr;
            }
            count += 1;

            if(count > max){
                max = count;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dadvgdfef"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("dvdff")); // 3
        System.out.println(lengthOfLongestSubstring("ddff")); // 2
        System.out.println(lengthOfLongestSubstring("ddffw")); // 2
        System.out.println(lengthOfLongestSubstring("ddffw3")); // 3
    }

}
