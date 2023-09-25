package exercicesClass90;

import java.util.Locale;
import java.util.Scanner;

public class AlturasMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int age, limit;
        double height, sumHeight = 0, heightTotal = 0, age16 = 0;

        System.out.print("Quantas pessoas serao digitadas: ");
        limit = sc.nextInt();
        Alturas[] person = new  Alturas [limit];
        String[] name16 = new String[limit];

        for (int i = 0; i < person.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa:%n", i+1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            person [i] = new Alturas(name, age, height);
        }

        for (int i = 0; i < person.length; i++) {
            heightTotal += person[i].getHeight();
            sumHeight = heightTotal / person.length;
        }

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16) {
                age16++;
                name16[i] = person[i].getName();
            }
        }

        double percent16 = (age16 / person.length) * 100;
        System.out.printf("Altura média: %.2f%n", sumHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percent16);

        for (String s : name16) {
            if (s != null) {
                System.out.println(s);
            }
        }
        /*
        // Same of the above expression
        for (int i = 0; i < name16.length; i++) {
            System.out.println(name16[i]);
        }
         */

        sc.close();
    }
}
