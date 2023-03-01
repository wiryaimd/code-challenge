package com.wiryaimd.codechallenge.google_foobar;

public class Code1 {

    public static void main(String[] args) {
        System.out.println(code1("ZY"));
        System.out.println(code1("AB"));
        System.out.println(code1("C"));
        System.out.println(code1("FXSHRXW"));
    }

    public static int code1(String columnTitle){
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            int charPos = (int) columnTitle.charAt(i) - 64;

            if(i == columnTitle.length() - 1){
                sum += charPos;
                break;
            }

            if (i > 0){
                sum += temp * 26;
            }else{
                sum = charPos * 26;
            }

            temp = sum;
        }
        return sum;

    }

}
