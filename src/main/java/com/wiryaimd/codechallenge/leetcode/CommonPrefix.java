package com.wiryaimd.codechallenge.leetcode;

public class CommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
        for (int i = 1; i <= strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(strs[0].substring(0, i))){
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i - 1));
        }
        return prefix.toString();
    }

    public static void main(String[] args) {


        String[] sam = {"flower","flow","floght", "fcrottt"};
        System.out.println(longestCommonPrefix(sam));
    }

}
