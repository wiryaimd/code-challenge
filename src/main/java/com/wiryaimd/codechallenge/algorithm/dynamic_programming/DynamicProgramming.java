package com.wiryaimd.codechallenge.algorithm.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {

    public static void main(String[] args) {

        // dynamic programming atau dikenal juga dengan memoization technique (disebut memoization karena .... read below)
        // intinya yg disebut dp itu ia menyimpan hasil komputasi/perhitungan yg mungkin akan digunakan kembali di iterative berikutnya
        //                                                  |^|
        // because in this the idea is to store the previously calculated result to avoid calculating it again and again.
        // In Dynamic Programming, divide the complex problem into smaller overlapping subproblems and storing the result for future use.

        // ex problem:
        //  Knapsack Problem, Weighted Job Scheduling, Floyd Warshall Algorithm



        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(13));

        System.out.println("---");

        // this blazingly more fast broo
        System.out.println(dpFibonacci(5));
        System.out.println(dpFibonacci(6));
        System.out.println(dpFibonacci(7));
        System.out.println(dpFibonacci(8));
        System.out.println(dpFibonacci(33));
        System.out.println(dpFibonacci(46));



    }

    // perbedaan menggunakan strategi dynami programming dan yg bukan

    // tidak menggunakan DP karena tidak sesuai pengertian atau juga tidak ada memoizationnya yekan
    public static int fibonacci(int x){ // time complexity O(2^n) yachh lebih berat karena bukan O n^2
        if (x <= 2){
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    // penggunaan DP
    // O(2.n) == O(n) time complexity
    // dengan O(n) space complexity
    private static Map<Integer, Integer> map = new HashMap<>(); // menggunakan map untuk menyimpan hasil kalkulasi sebelumnya, sehingga dapat digunakan disaat dibutuhkan
    public static int dpFibonacci(int x){
        if (map.get(x) != null){
            return map.get(x);
        }
        if (x <= 2){
            return 1;
        }
        int sum = dpFibonacci(x - 2) + dpFibonacci(x - 1);
        map.put(x, sum); // dengan x sebagai key untuk menyimpan hasil kalkulasi
        return sum;
    }

}
