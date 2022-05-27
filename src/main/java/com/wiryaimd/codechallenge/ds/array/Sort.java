package com.wiryaimd.codechallenge.ds.array;

public class Sort {

    public static void main(String[] args) {
        int[] needToSort = {1000, -3, 5469, 99, 23, 100, 304, 3, 0, 35, 2, 5, 1, 7, 3, 5, 6, 7};
        sort(needToSort);
    }

    // its like ... bubble sort ... maybee
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int sorted : arr){
            System.out.println(sorted);
        }
        return arr;
    }

}
