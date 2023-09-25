package exercicesClass90;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelhoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantityPerson, olderAge = 0;
        String olderPerson = "A";

        System.out.print("Quantas pessoas voce vai digitar? ");
        quantityPerson = sc.nextInt();
        MaisVelho[] vector = new MaisVelho[quantityPerson];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa: %n", i+1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            vector[i] = new MaisVelho(name, age);
            if (vector[i].getAge() > olderAge ){
                olderAge = vector[i].getAge();
                olderPerson = vector[i].getName();
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", olderPerson);


        sc.close();
    }
}
