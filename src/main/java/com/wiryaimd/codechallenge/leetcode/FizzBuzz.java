package com.wiryaimd.codechallenge.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> lul = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                lul.add("FizzBuzz");
            }else if(i % 3 == 0){
                lul.add("Fizz");
            }else if(i % 5 == 0){
                lul.add("Buzz");
            }else{
                lul.add(String.valueOf(i));
            }
        }
        return lul;
    }
}
