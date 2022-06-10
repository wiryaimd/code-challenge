package com.wiryaimd.codechallenge.leetcode;

public class MergeSortedArray {


    // eyooo sheshhhhh look at my stupid code broooo, its workkk
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            boolean isInsert = false;
            int tmp = 0;
            for(int j = i; j < m + n; j++){
                if((nums2[i] < nums1[j] || j > m + i - 1) && !isInsert){
                    tmp = nums1[j];
                    nums1[j] = nums2[i];
                    isInsert = true;
                    continue;
                }

                if(isInsert){
                    int val = nums1[j];
                    nums1[j] = tmp;
                    tmp = val;
                }
            }
        }

//        for(int a : nums1){
//            System.out.print(a + " ");
//        }
    }


    // sample twoo, easy to understand, butt its illegal brooo
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int y = m;
//        for(int x:nums2){
//            nums1[y] = x;
//            y++;
//        }
//
//        for(int i=0;i<nums1.length;i++){
//            for(int j=i+1;j<nums1.length;j++){
//                if(nums1[i] > nums1[j]){
//                    int temp = nums1[i];
//                    nums1[i] = nums1[j];
//                    nums1[j] = temp;
//                }
//            }
//        }
//        //Arrays.sort(nums1);
//    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] arr2 = {1, 2, 5, 7, 12};
        merge(arr1, 4, arr2, 5);


    }

}
