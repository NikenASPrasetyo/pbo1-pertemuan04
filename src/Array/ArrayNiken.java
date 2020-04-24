package Array;

import java.util.Scanner;
public class ArrayNiken {
    public static void main(String[] args) {
        Scanner matrik = new Scanner(System.in); //Matriks ordo 2x2

        int i;
        int x;
        int A [][] = new int[2][2];
        int B [][] = new int[2][2];
        int jum [][] = new int[2][2];

        System.out.println("INPUT MATRIK A");

        for (i = 0; i < A.length; i++){
            for (x = 0; x < A.length; x++){
                System.out.print("Matrik A baris ke " + (i + 1) + " kolom ke " + (x + 1) + ": ");
                A[i][x] = matrik.nextInt();
            }
        }
        System.out.println();
        System.out.println("INPUT MATRIK B");

        for (i = 0; i < B.length; i++){
            for (x = 0; x < B.length; x++){
                System.out.print("Matrik B baris ke " + (i + 1) + " kolom ke " + (x + 1) + ": ");
                B[i][x] = matrik.nextInt();
            }
        }
        System.out.println();
        System.out.println("MATRIK A");

        for (i = 0; i < A.length; i++){
            for (x = 0; x < A.length; x++){
                System.out.print(A[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("MATRIK B");

        for (i = 0; i < B.length; i++){
            for (x = 0; x < B.length; x++){
                System.out.print(B[i][x] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < jum.length; i++){
            for (x = 0; x < jum.length; x++){
                jum[i][x] = A[i][x] + B[i][x];

            }
        }
        System.out.println("PENJUMLAHAN MATRIK A DAN MATRIK B");

        for (i = 0; i < jum.length; i++){
            for (x = 0; x < jum.length; x++){

                System.out.print(jum[i][x] + " ");
            }
            System.out.println();
        }
    }
}