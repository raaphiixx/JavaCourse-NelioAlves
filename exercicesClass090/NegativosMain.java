package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class NegativosMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar ? ");
        int quantity = sc.nextInt();
        int[] negativeNumber = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Digite o %dº numero: ", i+1);
            int number = sc.nextInt();
            negativeNumber[i] = number;
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < negativeNumber.length; i++) {
            if (negativeNumber[i] < 0) {
                System.out.println(negativeNumber[i]);
            }

        }

        sc.close();

    }
}
