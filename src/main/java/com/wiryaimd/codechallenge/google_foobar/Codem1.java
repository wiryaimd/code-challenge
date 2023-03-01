package com.wiryaimd.codechallenge.google_foobar;

import java.util.ArrayList;
import java.util.List;

public class Codem1 {

    public static void main(String[] args) {

        String[] test = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        String[] test2 = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};


//        System.out.println("2".compareTo("12"));
//
//        System.out.println(aLessB(new String[]{"1", "11", "0"}, new String[]{"1", "12", "0"}));
//        System.out.println(aLessB(new String[]{"1", "1", "3"}, new String[]{"1", "1", "2"}));
//        System.out.println(aLessB(new String[]{"1", "0", "12"}, new String[]{"1", "0", "2"}));
//        System.out.println(aLessB(new String[]{"1", "0", "4"}, new String[]{"1", "0", "3"}));
//        System.out.println(aLessB(new String[]{"2", "1", "1"}, new String[]{"1", "0", "9"}));
//        System.out.println(aLessB(new String[]{"2", "0", "0"}, new String[]{"2", "0", "0"}));
//        System.out.println("les");
//        System.out.println(less2(new String[]{"1", "0", "0"}, new String[]{"2", "0", "0"}));
//        System.out.println(less2(new String[]{"1", "0", "0"}, new String[]{"1", "1", "0"}));
//        System.out.println(less2(new String[]{"1", "0", "4"}, new String[]{"1", "1", "3"}));
//        System.out.println(less2(new String[]{"1", "1", "3"}, new String[]{"1", "1", "5"}));
//        System.out.println(less2(new String[]{"2", "1", "3"}, new String[]{"1", "1", "5"}));
//        System.out.println(less2(new String[]{"2", "1", "3"}, new String[]{"3", "1", "5"}));
//        System.out.println(less2(new String[]{"3", "2", "3"}, new String[]{"3", "1", "5"}));
//        System.out.println(less2(new String[]{"3", "2",}, new String[]{"3", "1", "5"}));
//        System.out.println(less2(new String[]{"3", "2",}, new String[]{"3"}));
//        System.out.println(less2(new String[]{"3"}, new String[]{"3", "2"}));
//        System.out.println(less2(new String[]{"3", "0", "1"}, new String[]{"3", "0"}));


        String[] res = solve(test);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }


//        String[] as = "asd".split("\\.");
    }

//    public static String[] solution2(String[] l){
//        for (int i = 0; i < l.length; i++) {
//            String[] ver = l[i].split("\\.");
//            String[] ver2 = l[i].split("\\.");
//
//        }
//    }

    public static String[] solve(String[] l){
        for (int i = 0; i < l.length; i++) {
            String[] ver1 = l[i].split("\\.");
            for (int j = 0; j < l.length; j++) {
                String[] ver2 = l[j].split("\\.");
                boolean res = less2(ver1, ver2);
                System.out.println(l[i] + " n " + l[j] + " = " + res);
                if(res){
                    String temp = l[i];
                    l[i] = l[j];
                    l[j] = temp;
                }
            }
        }
        return l;
    }

    public static boolean aLessB(String[] a, String[] b){
        int aLen = a.length;
        int bLen = b.length;

        if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])){
            if (aLen < bLen){
                return true;
            }else if(bLen < aLen){
                return false;
            }

            if (Integer.parseInt(a[1]) == Integer.parseInt((b[1]))){

                if (aLen == 2 || bLen == 2)
                {
                    return false;
                }else if (aLen < bLen){
                    return true;
                }else if(bLen < aLen){
                    return false;
                }

                if (Integer.parseInt(a[2]) == Integer.parseInt((b[2]))){
                    return false;
                }else{
                    return Integer.parseInt(a[2]) < Integer.parseInt(b[2]);
                }

            }else{
                return Integer.parseInt(a[1]) < Integer.parseInt(b[1]);
            }
        }else{
            return Integer.parseInt(a[0]) < Integer.parseInt(b[0]);
        }
    }

//    public static boolean less2(String[] a, String[] b){
//        int aLen = a.length;
//        int bLen = b.length;
//
//        if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])){
//
//            if (aLen == 1 && bLen == 1){
//                return false;
//            }
//
//            if (aLen == 1){
//                return true;
//            }
//
//            if (bLen == 1){
//                return false;
//            }
//
//            if (Integer.parseInt(a[1]) == Integer.parseInt((b[1]))){
//                if (aLen == 2 && bLen == 2){
//                    return false;
//                }
//
//                if (aLen < bLen){
//                    return true;
//                }
//
//                if (bLen < aLen) {
//                    return false;
//                }
//
//                if (Integer.parseInt(a[2]) == Integer.parseInt((b[2]))){
//                    return false;
//                }else{
//                    return Integer.parseInt(a[2]) < Integer.parseInt((b[2]));
//                }
//
//
//            }else{
//                return Integer.parseInt(a[1]) < Integer.parseInt(b[1]);
//            }
//
//        }else{
//            return Integer.parseInt(a[0]) < Integer.parseInt(b[0]);
//        }
//    }


    public static boolean less2(String[] a, String[] b){
        int aLen = a.length;
        int bLen = b.length;

        if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])){

            if (aLen == 1 && bLen == 1){
                return false;
            }

            if (aLen == 1){

                return true;
            }

            if (bLen == 1){
                return false;
            }

            try {
                if (Integer.parseInt(a[1]) == Integer.parseInt((b[1]))) {
                    if (aLen == 2 && bLen == 2) {
                        return false;
                    }

                    if (aLen == 2) {
                        return true;
                    }

                    if (bLen == 2) {
                        return false;
                    }

                    try {
                        if (Integer.parseInt(a[2]) == Integer.parseInt((b[2]))) {
                            return false;
                        } else {
                            return Integer.parseInt(a[2]) < Integer.parseInt((b[2]));
                        }
                    } catch (IndexOutOfBoundsException e) {
                        return aLen < bLen;
                    }


                } else {
                    return Integer.parseInt(a[1]) < Integer.parseInt(b[1]);
                }
            }catch (IndexOutOfBoundsException e){
                return aLen < bLen;
            }

        }else{
            return Integer.parseInt(a[0]) < Integer.parseInt(b[0]);
        }
    }

//    public static String[] solution(String[] l) {
//        // Your code here
//        for (int i = 0; i < l.length; i++) {
//            String[] ver = l[i].split("\\.");
//
//
//            for (int j = 0; j < l.length; j++) {
//                boolean major = false;
//                boolean feature = false;
//                boolean revision = false;
//
//                String[] ver2 = l[j].split("\\.");
//
//                if(ver2[0].compareTo(ver[0]) == 0){
//
//                    if (ver2.length < ver.length && ver2.length == 2){
//                        move(l, i, j);
//                    }else if (ver2[1].compareTo(ver[1]) == 0){
//
//                        if (ver2.length < ver.length && ver2.length == 3) {
//                            move(l, i, j);
//                        }else if(ver2[2].compareTo(ver[2]) > 0){
//                            move(l, i, j);
//                        }
//
//                    }
//
//                    revision = true;
//
//                }else if (ver2[0].compareTo(ver[0]) > 0){
//                    major = true;
//                    continue;
//                }
//
//                if (ver2.length == 2 && ver2.length == ver.length && ver2[1].compareTo(ver[1]) > 0){
//                    feature = true;
//                }
//
//                if (ver2.length == 3 && ver2.length == ver.length && ver2[2].compareTo(ver[2]) > 0){
//                    revision = true;
//                }
//
//                if(ver2[0].compareTo(ver[0]) == 0){
//
//                    try {
//                        if (ver2[1].compareTo(ver[1]) > 0) {
//                            String temp = l[i];
//                            l[i] = l[j];
//                            l[j] = temp;
//                        } else if (ver2[2].compareTo(ver[1]) == 0) {
//
//                        }
//                    }catch (IndexOutOfBoundsException e){
//                        if (ver2.length < ver.length){
//                            String temp = l[i];
//                            l[i] = l[j];
//                            l[j] = temp;
//                            continue;
//                        }
//                    }
//                }
//            }
//
//            String temp = l[i];
//            l[i] = l[j];
//            l[j] = temp;
//        }
//
//
//        return l;
//    }
//

}
