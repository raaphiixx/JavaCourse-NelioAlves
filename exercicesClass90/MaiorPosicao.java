package exercicesClass90;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantity, posBignumber = 0, biggerNumber = 0;

        System.out.print("Quantos numeros voce vai digitar ? ");
        quantity = sc.nextInt();
        int[] vector = new int[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite o %sº numero: ", i + 1);
            int number = sc.nextInt();
            vector[i] = number;
            if (number > biggerNumber) {
                biggerNumber = number;
                posBignumber = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %s%n", biggerNumber);
        System.out.printf("POSICAO DO MAIOR VALOR = %s", posBignumber);


        sc.close();
    }
}
