package com.wiryaimd.codechallenge.hackerrank.certify;

import java.util.ArrayList;
import java.util.List;

public class LargestArea {

    public static int sortedSum(List<Integer> a) {

        int res = 0;

        List<Integer> list = new ArrayList<>();
        list.add(a.get(0));
        res += a.get(0);

        for(int i = 1; i < a.size(); i++){
            int val = a.get(i);
            int lenList = list.size();
            for(int k = 0; k < list.size(); k++){
                if(val <= list.get(k)){
                    list.add(k, val);
                    break;
                }

                if (k == lenList - 1){
                    list.add(val);
                    break;
                }
            }

            for(int j = 0; j < list.size(); j++){
                res += list.get(j) * (j + 1);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(8);
        System.out.println(sortedSum(list));
    }
}
