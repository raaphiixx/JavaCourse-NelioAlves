package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoasMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int limit, countM = 0, countF = 0;
        double heightF = 0, lessHeight = 0, higherHeight = 0;

        System.out.print("Quantas pessoas serao digitas? ");
        limit = sc.nextInt();
        DadosPessoas[] person = new DadosPessoas[limit];

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Altura da %dª pessoa: ", i+1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %dª pessoa: ", i+1);
            char gender = sc.next().charAt(0);
            person[i] = new DadosPessoas(height, gender);
            if (gender == 'M' || gender == 'm') {
                countM++;
            } else {
                countF++;
                heightF += person[i].getHeight();
            }
            if (higherHeight < person[i].getHeight()) {
                higherHeight = person[i].getHeight();
            }
        }
        lessHeight = person[0].getHeight();

        for (int i = 0; i < person.length; i++) {
            if (lessHeight > person[i].getHeight()) {
                lessHeight = person[i].getHeight();
            }
        }


        System.out.printf("Menor Altura: %.2f%n", lessHeight);
        System.out.printf("Maior Altura: %.2f%n", higherHeight);
        System.out.printf("Media das alturas das mulheres = %.2f%n", heightF / countF);
        System.out.printf("Numero de homens = %d%n", countM);
    }
}
