package com.wiryaimd.codechallenge.ds.array;

public class SortArray {

    public static void main(String[] args) {

        int[] needToSort = {1000, -3, 5469, 99, 23, 100, 304, 3, 0, 35, 2, 5, 1, 7, 3, 5, 6, 7};
        for (int i = 0; i < needToSort.length; i++) {
            for (int j = i; j < needToSort.length; j++) {
                if (needToSort[j] < needToSort[i]){
                    int tmp = needToSort[i];
                    needToSort[i] = needToSort[j];
                    needToSort[j] = tmp;
                }
            }
        }

        for(int sorted : needToSort){
            System.out.println(sorted);
        }

    }

}
