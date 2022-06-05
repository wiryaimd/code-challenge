package com.wiryaimd.codechallenge.ds;

public class Recursive {

    public static int hayuRekur(int i){
        System.out.println(i);

        if(i <= 0){
            return 0;
        }else if(i == 1){
            return 1;
        }else{
            int res = hayuRekur(i - 1) + hayuRekur(i - 2);;
            System.out.println("res: " + res);
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(hayuRekur(6));
    }

}
