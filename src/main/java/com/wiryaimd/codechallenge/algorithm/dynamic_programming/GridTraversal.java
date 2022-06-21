package com.wiryaimd.codechallenge.algorithm.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class GridTraversal {

    public static void main(String[] args) {


        // ex problem: pada grid/row/column dengan start point x, berapa banyak jalan dari x untuk ke point end
        // jalan hanya bisa dilakukan dengan ke kanan atau ke bawah

        // ex point: "3,2" sebaga string

        System.out.println(gridTraversal(1, 1));
        System.out.println(gridTraversal(2, 3));
        System.out.println(gridTraversal(3, 2));
        System.out.println(gridTraversal(3, 3));
        System.out.println(gridTraversal(9, 9));
        System.out.println(gridTraversal(18, 18));
//        System.out.println(gridTraversal(331, 1844)); // too big stupd
    }

    // dengan penggunaan dynamic programming
    // cara penyelesaiaan mirip seperti penggunaan fibonacci dynamic prog

    // key nya string untuk dua pointer (row, column) dan value nya itu int yach
    private static Map<String, Long> map = new HashMap<>();

    public static long gridTraversal(int row, int col){
        String key = row + "," + col;
        if (map.get(key) != null){
            return map.get(key);
        }

        if (row == 1 && col == 1){
            return 1;
        }

        if (row == 0 || col == 0){
            return 0;
        }

        long res = gridTraversal(row - 1, col) + gridTraversal(row, col -1);
        map.put(key, res);

        return res;

    }

}
