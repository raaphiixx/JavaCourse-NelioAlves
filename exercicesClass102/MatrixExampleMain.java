package exercicesClass102;

import java.util.Scanner;

public class MatrixExampleMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int [][] mat = new int[limit][limit];
        int negativeNumbers = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) { // mat[i].length is size of colluns
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.print("Negative Numbers = " + negativeNumbers);

        sc.close();
    }
}
