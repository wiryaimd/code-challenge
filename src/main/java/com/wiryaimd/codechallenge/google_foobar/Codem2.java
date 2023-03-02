package com.wiryaimd.codechallenge.google_foobar;

public class Codem2 {

    public static void main(String[] args) {

        String[] test = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        String[] test2 = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        String[] test3 = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2", "1.0.0"};
        String[] test4 = {"2.0.0", "2", "2.0"};
        String[] test5 = {"0.0.1", "0.1.2", "0.0.11", "0.3.0", "0.1.1", "1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0", "2.0.1", "2", "2.0", "1.0.0", "2.0.2", "2.1.0", "2.0.3", "1.0.30", "3.4", "9.9", "3.3.3", "3.4.0", "3.0.4", "3.4", "4.4", "3.4", "1.2.2", "1.1"};
        String[] test6 = {"3.4", "3.0.4", "2.0.2", "2.0.3"};
        String[] test7 = {"0.1.1", "0.1.2", "0.1"};

        String[] res = solve(test5);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static String[] solve(String[] l){
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                String[] ver1 = l[i].split("\\.");
                String[] ver2 = l[j].split("\\.");
                boolean isLess = compare(ver1, ver2);
                if (isLess){
                    String tmp = l[i];
                    l[i] = l[j];
                    l[j] = tmp;
                }
            }
        }
        return l;
    }

    public static boolean compare(String[] ver1, String[] ver2){

        // 1.1.0
        // 1.1

        int min = Math.min(ver1.length, ver2.length);
        int max = Math.max(ver1.length, ver2.length);

        boolean leftLess = false;
        for (int i = 0; i < min; i++) {
            int val1 = Integer.parseInt(ver1[i]);
            int val2 = Integer.parseInt(ver2[i]);
            if (val1 < val2){
//                leftLess = true;
//                break;
                return true;
            }

            if (val1 > val2){
//                break;
                return false;
            }
        }

        int len = Math.abs(ver1.length - ver2.length);
        boolean isLeft = ver1.length < ver2.length;
        String[] highest = isLeft ? ver2 : ver1;
        if (isLeft){
            return true;
        }
//         2 - 2.0
//        if (ver1[0].equals(ver2[0])) {
//            boolean isZero = false;
//            for (int i = min; i < max; i++) {
////                int high = Integer.parseInt(highest[i]);
//                String zero = highest[i];
//                if (isLeft && !zero.equals("0")){
////                    isZero = true;
////                    break;
//                    return true;
//                }
//
////                if (isLeft && zero.equals("0")){
////                    isZero = true;
////                    break;
////                }
//            }
////            leftLess = isZero;
//        }

//        return leftLess;
        return false;
    }

}
