package com.wiryaimd.codechallenge.knowledge.SOLID_principle.liskov_substitution;

public class LiskovSubstitution {

    public static void main(String[] args) {

        // The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
        // https://stackify.com/solid-design-liskov-substitution-principle/ males ah kon

        // It extends/memperluas the Open/Closed principle and enables you to replace objects of a parent class
        // with objects of a subclass without breaking the application.

        // This requires all subclasses to behave in the same way as the parent class. To achieve that, your subclasses need to follow these rules:
        // - Don’t implement any stricter validation rules on input parameters than implemented by the parent class.
        // - Apply at the least the same rules to all output parameters as applied by the parent class.

        // mungkin intinya dengan pemakaian extends ke super class, kita perlu memperhatikan saat implement method yang di extends agar tidak terjadi kesalahan/bug/melanggar prinsip LS
        // atau juga perlu apakah method tersebut memang harus berada di superclass atau perlu dipisahkan dan ditaruh ke subclass nya saja

        // jadi kita diperbolehkan membuat method umum tanpa diturunkan dari superclass seperti jika dibutuhkannya input paramater objek yg berbeda dari tiap class
        // atau kondisi lainnya

    }

}
