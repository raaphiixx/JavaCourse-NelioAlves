package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantity, number, quantityEven = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        quantity = sc.nextInt();
        int[] evenNumbers = new int[quantity];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.printf("Digite o %dº numero: ", i+1);
            number = sc.nextInt();
            evenNumbers[i] = number;
            if (number % 2 == 0) {
                quantityEven++;
            }
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 == 0) {
                System.out.printf("%d ", evenNumbers[i]);
            }
        }

        System.out.printf("%nQUANTIDADE DE PARES = %d", quantityEven);

        sc.close();
    }
}
