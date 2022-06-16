package com.wiryaimd.codechallenge.leetcode;

public class ReverseInteger {


    // medium butt ezz actually..
    public int reverse(int x) {
        boolean isNegative = false;

        String raw = String.valueOf(x);
        if(raw.contains("-")){
            raw = raw.replaceAll("-", "");
            isNegative = true;
        }

        String reversed = new StringBuilder(raw).reverse().toString();
        try{
            int res = Integer.parseInt(reversed);
            if(isNegative){
                res = -res;
            }
            return res;
        }catch(NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
