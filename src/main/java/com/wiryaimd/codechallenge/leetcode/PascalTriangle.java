package com.wiryaimd.codechallenge.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // ezzz kont
    // time complexity??? how to count j < i - 1 ???
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for(int i = 1; i < numRows; i++){
            List<Integer> col = new ArrayList<>();
            col.add(1);

            for(int j = 0; j < i - 1; j++){
                int sum = res.get(i - 1).get(j) + res.get(i - 1).get(j + 1);
                col.add(sum);
            }

            col.add(1);

            res.add(col);
        }
        return res;
    }

    public static void main(String[] args) {
        for (List<Integer> data : generate(8)){
            for (int a : data){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

}
