package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class Soma_VetorMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity;
        System.out.print("Quantos numeros voce vai digitar? ");
        quantity = sc.nextInt();
        double[] vect = new double[quantity];
        double numbers, sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº numero: ", i+1);
            numbers = sc.nextDouble();
            vect[i] = numbers;
            sum += numbers;
        }
        System.out.print("VALORES= ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f ",vect[i]);
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f", sum/ vect.length);

        sc.close();
    }
}
