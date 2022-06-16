package com.wiryaimd.codechallenge.knowledge;

public class BitwiseOperator {

    public static void main(String[] args) {

        // Bitwise AND
        // menggunakan &&

        // Bitwise OR
        // menggunakan ||

        // Bitwise XOR
        // menggunakan ^


        // ini dinamakan Bitwise XOR
        // jika kedua input nya berlawanan, atau berbeda jenis / true dan false == maka hasilnya true
        if (false ^ false){
            System.out.println("crottt");
            return;
        }

        int a = 0xFF; // epep ngap

        System.out.println(a);
        System.out.println("ngapa ngabbs");



        // menjumlah dengan bitwise operator
        int v1 = 9; // in bianry -> 01001
        int v2 = 5; // in binary -> 00101

        // akan membandingkan bilangan binary dari kedua value tsb

        // explain:
        // 13 ke binary ->         01101
        // 5 ke binary ->          00101
        // membandingkan dgn AND = 00101 -> 5 (dalam desimal)
        int and = 13 & v2; //
        System.out.println("AND: " + and); // res = 1

        int xor = v1 ^ v2; // bitwise (operator XOR)
        System.out.println("XOR: " + xor);

        int or = v1 | v2; // operator OR ngabs
        System.out.println("OR: " + or);

        int not = ~v1; // NOT operator ->> akan membalikan nilai binary (its like ! operator definitely)
                        // 9 = 01001 -> 10110 = 22 (bukan kek gini ternyata)
        System.out.println("NOT: " + not); // hasilnya negative???






    }

}
