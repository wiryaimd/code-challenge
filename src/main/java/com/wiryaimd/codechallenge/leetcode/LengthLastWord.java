package com.wiryaimd.codechallenge.leetcode;

import java.math.BigInteger;

public class LengthLastWord {

    public int lengthLastWord(String s){
        String[] raw = s.split("\s+");
        return raw[raw.length - 1].length();
    }

    public static void main(String[] args) {

    }

}
