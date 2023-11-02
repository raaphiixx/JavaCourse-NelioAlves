package exerciceClass165;

import exerciceClass165.entites.LegalTaxPayer;
import exerciceClass165.entites.NaturalTaxPayer;
import exerciceClass165.entites.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        double quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Tax payer #" + i + "data: ");
            System.out.print("Individual or Company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double income = sc.nextDouble();
            if (ic == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                TaxPayer person = new NaturalTaxPayer(name, income, health);
                list.add(person);
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                TaxPayer person = new LegalTaxPayer(name, income, employees);
                list.add(person);
                System.out.println(person.payTax());
            }
        }
        System.out.println();

        System.out.println("Taxes Paid: ");
        double sum = 0;
        for (TaxPayer p: list) {
            System.out.println(p);
            sum += p.payTax();
        }
        System.out.println();

        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
