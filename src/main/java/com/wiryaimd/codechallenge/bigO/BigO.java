package com.wiryaimd.codechallenge.bigO;

public class BigO {

    public static void main(String[] args) {
        // big o notation memilih hasil time complexity terbesar dari sebuah algoritma
        // seperti jika f(n) = n*2 + n^2 - n^3; maka notasi big o adalah O(n^3)


        // ex o notation
        // o(1) o(n) o(n^2) o(n^3) o(nm) o(log n) o(n log n) o(2^n) o(!n)

    }

//     ini O(1) time complexity
//     karena karena akhir kondisinya adalah 5, bukan N
    public void o1(){
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += 3;
        }
    }


//     O(n) time complexity
//    pada loop membutuhkan n kali untuk iterasi
    public void oN(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += i + 2;
        }
    }

//    O(n^2) time complexity
//    karena dua forloop membutuhkan n kali untuk iterasi
    public void oN2(int n1){
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {

            }
        }
    }
    
//    O(nm)
//    terdapat n pada loop 1 dan m pada loop 2
    public void nm(int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
            }
        }
    }

    // O(n^2)
    public void oN2V2(int n){
        for (int i = 0; i < n; i++) {
            // bedanya pada j = i
            for (int j = i; j < n; j++) {

            }
        }
        // jadi ada O n time pada loop pertama
        // dan loop kedua kita perlu n untuk j = 0, n-1 untuk j = 1, n-2 untuk j = 2, dan seterusnya
        // sedangkan loop pertama kan n -> +1, +2, +3 sedangkan yg kedua karena ini j = i jadinya n -> -1, -2, -3 dll
        // jadinya jika digabungkan menjadi O(n(n+1)/2) menjadi = O(n^2/2 + n/2) akan dipilih yg terbesar menjadi O(n^2) time complexity

    }

}
