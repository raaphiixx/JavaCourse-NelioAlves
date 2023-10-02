package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int limit;
        double sumGrades = 0;


        System.out.print("Quantos elementos vai ter o vetor? ");
        limit = sc.nextInt();
        double [] vector = new double[limit];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            sumGrades += vector[i];
        }
        double media = sumGrades / limit;
        System.out.printf("MEDIA DO VETOR: %.3f%n", media);
        System.out.printf("ELEMENTOS ABAIXO DA MEDIA: %n");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < (sumGrades / vector.length)){
                System.out.println(vector[i]);
            }
        }


        sc.close();
    }
}
