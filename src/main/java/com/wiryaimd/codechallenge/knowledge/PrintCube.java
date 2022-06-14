package com.wiryaimd.codechallenge.knowledge;

public class PrintCube {

    public static void main(String[] args) {

        /**
         *              *----------------------------------------*
         *            / |                                       / |
         *          /   |                                     /   |
         *        /     |                                   /     |
         *      *-------|----------------------------------*      |
         *      |       |                                  |      |
         *      |       *--------------------------------- |------*
         *      |     /                                    |     /
         *      |   /                                      |   /
         *      | /                                        | /
         *      * -----------------------------------------*
         */

        printCube(5, 3, 3);

    }

    public static void printCube(int p, int l, int t){
//        t = t - 1;
//        p = p * 2;
//        l = l / 2;

        int m1 = (p * 2) + (l * 2);
        int m2 = t * 2;

        char edges = '*';
        int t1 = l * 2;
        for (int i = 0; i < m2; i++) {
            int p1 = l * 2;
            t1 -= 1;
            for (int j = 0; j < m1; j++) {
                if (j == m1 - 1){
                    edges = '*';
                }

                if(j > p1 && i == 0){
                    System.out.print(edges);
                    edges = '-';
                    continue;
                }

                System.out.print(" ");

                if (i == 0){
                    continue;
                }

                if (j == t1){
                    System.out.print("/");
                }else if(j == p1 || j == m1 - 1){
                    System.out.print("|");
                }
            }
            System.out.println();

        }




    }

}
