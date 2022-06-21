package com.wiryaimd.codechallenge.hackerrank.certify;

import java.util.ArrayList;
import java.util.List;

public class CountSorted {

    public static void main(String[] args) {
        List<Boolean> bol = new ArrayList<>();
        bol.add(true);
        bol.add(true);

        List<Integer> dis = new ArrayList<>();
        dis.add(1);
        dis.add(3);

        System.out.println(getMaxArea(4, 3, bol, dis));

    }

    public static List<Long> getMaxArea(int w, int h, List<Boolean> isVertical, List<Integer> distance) {
        // Write your code here
        List<Long> result = new ArrayList<>();

        long sum = (long) w * h;
        long cut = 0;

        int countV = 0;
        int countH = 0;
        for(int i = 0; i < isVertical.size(); i++){
            if(!isVertical.get(i)){
                // cut += ((long) (h - distance.get(i)) * w) - count;
                cut += w - countV;
                sum -= cut;

                countH += 1;
            }else{
                // cut += ((long) distance.get(i) * h) - countH;
                cut += h - countH;
                sum -= cut;

                countV += 1;
            }

            result.add(sum);
        }

        return result;

    }

}
