package com.wiryaimd.codechallenge.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {

        int a = 2600;
        System.out.println(a % 1000);
        a = a % 1000;
        System.out.println(a % 500);
        StringBuilder sb = new StringBuilder();
        sb.append("a".repeat(1));
        System.out.println(sb.toString());
    }
}
