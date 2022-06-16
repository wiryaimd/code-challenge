package com.wiryaimd.codechallenge.leetcode;

public class StringToInteger {

    public static int myAtoi(String s) {
        String[] raw = s.split("\s+");
        int res = 0;

        for(int i = 0; i < raw.length; i++){
            if(i > 1){
                return 0;
            }

            boolean isNegative = false;

            String data = raw[i];
            if(data.length() == 0){
                continue;
            }

            if(data.charAt(0) == '-'){
                data = data.replaceAll("-", "");
                isNegative = true;

                if (data.length() != 0 && (data.charAt(0) == '-' || data.charAt(0) == '+')){
                    return 0;
                }
            }

            if (data.contains(".")){
                data = data.split("\\.")[0];
            }

            try{
                int val = Integer.parseInt(data);
                res = isNegative ? res - val : val;
                break;
            }catch(NumberFormatException e){
                if(data.matches("\\d+$")){
                    res = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("3.14159"));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int e = (int) 2.7D;
        System.out.println(e);

        if("523552422424  ".matches("\\d+$")){
            System.out.println("anjae");
            return;
        }
        System.out.println("suu");
    }

}
