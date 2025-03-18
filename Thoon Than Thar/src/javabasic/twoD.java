package javabasic;

import java.util.Scanner;

public class twoD {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows (L1):");
        int L1 = s.nextInt();
        
        System.out.println("Enter the number of columns (L2):");
        int L2 = s.nextInt();
        
        int[][] A = new int[L1][L2];

        for(int i = 0; i < L1; i++) {
            System.out.println("Enter values for row " + (i + 1) + ":");
            for(int j = 0; j < L2; j++) {
                A[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Matrix:");
        for(int i = 0; i < L1; i++) {
            for(int j = 0; j < L2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        s.close(); // Close Scanner
    }
}