package com.wiryaimd.codechallenge.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s){

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(i + 1 < s.length()){
                char sec = s.charAt(i + 1);
                if (romanMap.get(x) < romanMap.get(sec)){
                    count += romanMap.get(sec) - romanMap.get(x);
                    i += 1;
                    continue;
                }
            }
            count += romanMap.get(x);
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
