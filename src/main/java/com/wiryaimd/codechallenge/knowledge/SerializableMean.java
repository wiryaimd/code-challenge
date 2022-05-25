package com.wiryaimd.codechallenge.knowledge;

import java.io.*;

public class SerializableMean {

    public static void main(String[] args) throws IOException {
        IniModel iniModel = new IniModel("wiryaimd nih bozz", "mengnjaen", 23);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(bos);
        outputStream.writeObject(iniModel);
        outputStream.flush();

        byte[] res = bos.toByteArray();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

// serializable digunakan untuk mengubah suatu objek/class menjadi urutan bit agar dapat disimpan kedalam media penyimpanan atau di kirim melalui jaringan seperti http ... its maybee
class IniModel implements Serializable {

//    @Serial
    private static final long serialVersionUID = 8683452581122892189L; // ini digunakan untuk memastikan data yang disimpan dan yang diload memiliki atribut yg sama okEE
//    public static final long serialVersionUID = 23L;

    private String nama;
    private String alamat;
    private int umur;

    public IniModel(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }
}
