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

}
