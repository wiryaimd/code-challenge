package com.wiryaimd.codechallenge.hackerrank.ds.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    // o log n??? orr its o n yachh
    public static List<Integer> reverse(List<Integer> list){
        for (int i = 0; i < list.size() / 2; i++) {
            int tmp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, tmp);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(3);
        data.add(1);
        data.add(5);
        data.add(6);
        data.add(4);
        data.add(3);
        data.add(9);
        data.add(2);
        data.add(8);

        reverse(data);
    }
}
