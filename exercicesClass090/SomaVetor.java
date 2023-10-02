package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int limit = sc.nextInt();
        int [] vectorA = new int[limit];
        int [] vectorB = new int[limit];
        int [] vectorC = new int[limit];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println(vectorA[i] + vectorB[i]);
        }
        sc.close();
    }
}
