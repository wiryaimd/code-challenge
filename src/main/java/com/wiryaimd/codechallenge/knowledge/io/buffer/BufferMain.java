package com.wiryaimd.codechallenge.knowledge.io.buffer;

import java.io.*;

public class BufferMain {

    public static void main(String[] args) throws IOException {

        // When you write data to a stream, it is not written immediately, and it is buffered.
        // So use flush() when you need to be sure that all your data from buffer is written.

        // The buffering is mainly done to improve the I/O performance

        // jadi buffer ini menyimpan byte tersebut di memory agar dapat dipakai dengan cepat/performance, ketika buffer sudah penuh (tergantung buffer size) maka akan di flush otomatis?
        // berbeda dengan inputstream atau outputstream yg menyimpan nya ke hardisk tanpa di temporarykan di buffer


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"))); // jadi byte yang ada pada outputStream disimpan temporary di Buffered / Buffer
        writer.write("anjime awokawokawo");
        writer.write("jiahahah ");
//        writer.flush();


    }
}
