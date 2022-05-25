package com.wiryaimd.codechallenge.java17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUpdate {

    public static void main(String[] args) {

        // java 9
        // - membuat immutable collections, tidak dapat di add, remove, atau modifikasi
        // - private interface method
        List<String> list1 = List.of(); // empty list
        Map<Integer, String> map = Map.of(1, "asd", 2, "ngwe", 3 , "dll");
//        list1.add("ngewe banh"); // XX


        // java 10
        var ngontol = "abiez";
//        var gabisatanpainit;

        // java 11
        // - method / util baru pada string
        String anjae = "for ex yach";
        anjae.isBlank();
        anjae.lines().collect(Collectors.toList());
        anjae.repeat(3);
        anjae.strip(); // remove whitespace


        // java 12
        // change switch case
        switch ("buset"){
            case "anjae", "mengajae" -> System.out.println("wadefuk");
            case "iyachh" -> System.out.println("dasasd");
        }


        // java 14
        // - record type
        // - null point error instruction change
        // sebuah data class yang digunakan untuk menyimpan pure data, atau sebagai alternatif menghindari boilerplate pada pembuatan pojo
        record Anjass(String username, String location, int ageAhaha){} // auto generate constructor, getter, setter
        Anjass anjass = new Anjass("wiryaimd", "bali", 18);
        int age = anjass.ageAhaha();
        String username = anjass.username();


        // java 15
        // - text block
        String iniJsonBanh = """
                mengont amat luwh aowkawokaw
                jadi ginich yachh ahaha kont
                
                data: {
                    "username": "wiryaimd",
                    "withYou: "iflonely youu"
                }
                
                """;
        System.out.println(iniJsonBanh);

        // java 16
        // - mengurangi boiler plate pada stream.collect(Collectors.toList());
        // menjadi stream.toList();


    }

    // java 17
    // - sealed class, permits dll
    // - interfaces restricts
//    public abstract sealed class CekSealed permits {}

}
