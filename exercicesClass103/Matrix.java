package exercicesClass103;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int row = sc.nextInt();
        System.out.print("How many columns? ");
        int column = sc.nextInt();
        int[][] mat = new int[row][column];

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Choose a number: ");
        int matrixNumber = sc.nextInt();

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == matrixNumber) {
                    System.out.println("Position " + i + ","+ j);

                    if (j > 0 && j < mat[i].length) {
                        System.out.println("Left: " + mat[i][(j-1)]);
                    }

                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[(i)][(j+1)]);
                    }

                    if (i > 0) {
                        System.out.println("UP: " + mat[(i-1)][j]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[(i+1)][j]);
                    }

                    System.out.println();
                }
            }
        }
         sc.close();
    }

}

