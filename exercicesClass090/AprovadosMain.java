package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class AprovadosMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int limit;

        System.out.print("Quantos alunos serao digitados: ");
        limit = sc.nextInt();
        Aprovados[] vector = new Aprovados[limit];
        String[] approved = new String[limit];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %d aluno: %n", i+1);
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            vector[i] = new Aprovados(name, grade1, grade2);
            if (vector[i].media() >= 6) {
                approved[i] = vector[i].getName();
            }
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < approved.length; i++) {
            if (approved[i] != null) {
                System.out.println(approved[i]);
            }
        }

    }
}
