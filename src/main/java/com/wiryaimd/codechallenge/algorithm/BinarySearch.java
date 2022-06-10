package com.wiryaimd.codechallenge.algorithm;

import com.wiryaimd.codechallenge.ds.array.Sort;

public class BinarySearch {

    public static void main(String[] args) {

        // binary search must sorted ye kont
//        int[] arr = {1000, -3, 5469, 99, 23, 100, 304, 3, 0, 35, 2, 5, 1, 7, 3, 5, 6, 7, 40, 20, 123, 5, 7, 5670, 349, 23490, 64, 8, 5677};
        int[] arr = {1, 3, 6, 8, 10, 11};
        int[] sortArr = Sort.sort(arr);
        int target = 9;

        int low = 0, high = sortArr.length - 1;
        while (low <= high){
            System.out.println("iterate y");
            int mid = low + (high - low) / 2;
            if(sortArr[mid] == target){
                System.out.println("mid get: " + mid);
                System.out.println(sortArr[mid]);
                break;
            }

            if (sortArr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            System.out.println("mid: " + mid);
            System.out.println("start: " + low);
        }

    }


}
