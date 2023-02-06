package com.wiryaimd.codechallenge.knowledge.io;

import java.io.*;
import java.util.stream.Collectors;

public class InputOutput {

    private static final String TXT_FILE = "C:\\Users\\adnya\\Documents\\_programming\\java\\code-challenge\\src\\main\\resources\\test.txt";

    public static void main(String[] args) throws IOException {

        // ex out n input:
        InputStream inputStream = new FileInputStream(new File(TXT_FILE)); // baca file data (File Input)
        OutputStream outputStream = new FileOutputStream(new File(TXT_FILE)); // write file data (File Output)

        outputStream.write("int text 2".getBytes());
        outputStream.flush(); // jadi flush fungsinya untuk mengirim apa yg di write gitu, kaya commit gitu,
        System.out.println("write n flush: 1");

        outputStream.write("ngok abiez".getBytes());
//        outputStream.flush(); // kalo belum di flush, maka text ngok abiez tidak akan ikut ter write
        System.out.println("write: 2");

//        outputStream.close(); // close untuk menutup outputsream jika sudah tidak terpakai, close juka akan memanggil flus() ? mybee

        char a = (char) inputStream.read(); // jadi read(): int, mengreturn int dengan int itu ascii dari char

        // jadi buffer itu ... baca package buffer
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // bisa juga pakae bufferedReader untuk read inputStream
        String textFile = reader.lines().collect(Collectors.joining(" "));
        System.out.println(textFile);

//        DataOutput dataOutput = new DataOutputStream(outputStream); // untuk write data yachh. not FileOutputStream
//        dataOutput.write();

    }

}
