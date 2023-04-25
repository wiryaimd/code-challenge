package com.wiryaimd.codechallenge.gmsthic;

import java.util.Scanner;

public class Lul1 { // weird sort

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            input[i] = scanner.nextInt();
        }

        long start = System.nanoTime();


        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {

                int valI = input[i];
                int valJ = input[j];

                String strI = String.valueOf(valI);
                String strJ = String.valueOf(valJ);

                int max = Math.max(strI.length(), strJ.length());

                String form1 = "%0" + max + "d";

                String strVal = new StringBuilder(String.format(form1, valI)).reverse().toString();
                String strVal2 = new StringBuilder(String.format(form1, valJ)).reverse().toString();

                if (strVal.compareTo(strVal2) < 0){
                    int tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }


        long end = System.nanoTime() - start;
        System.out.println(end / 1000000);

        System.out.println("res");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }

}
