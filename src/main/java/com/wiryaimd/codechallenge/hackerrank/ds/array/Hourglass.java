package com.wiryaimd.codechallenge.hackerrank.ds.array;

import java.util.ArrayList;
import java.util.List;

public class Hourglass {

    public static int hourGlassSum(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int count = 0;

                count += arr.get(i).get(j);
                count += arr.get(i).get(j + 1);
                count += arr.get(i).get(j + 2);
                count += arr.get(i + 1).get(j + 1);
                count += arr.get(i + 2).get(j);
                count += arr.get(i + 2).get(j + 1);
                count += arr.get(i + 2).get(j + 2);

                if (count > max){
                    max = count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(0);

        arr.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);

        arr.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        arr.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(0);
        list4.add(0);
        list4.add(2);
        list4.add(4);
        list4.add(4);
        list4.add(0);
        arr.add(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(0);
        list5.add(0);
        list5.add(0);
        list5.add(2);
        list5.add(0);
        list5.add(0);
        arr.add(list5);

        List<Integer> list6 = new ArrayList<>();
        list6.add(0);
        list6.add(0);
        list6.add(1);
        list6.add(2);
        list6.add(4);
        list6.add(0);
        arr.add(list6);

        System.out.println(hourGlassSum(arr));


    }

}
