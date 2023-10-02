package exercicesClass90;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int limit;
        double sumOdds = 0, quantOdds = 0;

        System.out.print("Quantos elementos vai ter o vetor ? ");
        limit = sc.nextInt();
        int [] vector = new int[limit];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vector[i] = number;
            if (number % 2 == 0) {
                quantOdds++;
                sumOdds += number;
            }
        }
        String result = sumOdds > 0 ? String.format("MEDIA DOS PARES: %.2f", sumOdds / quantOdds) : "NENHUM NUMERO PAR";

        System.out.println(result);
    }
}
