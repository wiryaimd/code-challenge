package com.wiryaimd.codechallenge.knowledge.crlf;

public class Crlf {


    public static void main(String[] args) {

        // crlf = carriage return line feed (windows)
        // lf = line feed (unix, linux?)
        // cr = carriage return (macos)

        // jadi crlf itu enter di windows atau line break di wind gituu, caranya pake ini \r\n
        // penggunaan yg berguna ketika send form data, requirement nya harus pake enter crlf okkk

        String cek = "\r\nasede awokawokw \r\n iyhh ngapp asdasdasd";
        System.out.println(cek);

    }


//    public static boolean less2(String[] a, String[] b){
//        int aLen = a.length;
//        int bLen = b.length;
//
//        if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])){
//
//            if (aLen == 1 && bLen == 1){
//                System.out.println("n1");
//                return false;
//            }
//
//            if (aLen == 1){
//                System.out.println("n2");
//                return true;
//            }
//
//            if (bLen == 1){
//                System.out.println("n3");
//                return false;
//            }
//
//            if (Integer.parseInt(a[1]) == Integer.parseInt((b[1]))){
//                try{
//                    if (Integer.parseInt(a[2]) == Integer.parseInt((b[2]))){
//                        System.out.println("n4");
//                        return false;
//                    }else{
//                        System.out.println("n5");
//                        return Integer.parseInt(a[2]) < Integer.parseInt((b[2]));
//                    }
//                }catch (IndexOutOfBoundsException e){
//                    if (aLen < bLen){
//                        System.out.println("n6");
//                        return true;
//                    }else{
//                        System.out.println("n7");
//                        return false;
//                    }
//                }
//
//
//            }else{
//                System.out.println("n8");
//                return Integer.parseInt(a[1]) < Integer.parseInt(b[1]);
//            }
//
//        }else{
//            System.out.println("n9");
//            return Integer.parseInt(a[0]) < Integer.parseInt(b[0]);
//        }
//    }

}
