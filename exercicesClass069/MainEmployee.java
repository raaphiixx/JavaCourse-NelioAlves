package exercicesClass069;

import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee worker = new Employee();

        System.out.print("Name: ");
        worker.name = sc.nextLine();

        System.out.print("Gross salary: ");
        worker.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        worker.tax = sc.nextDouble();

        System.out.printf("Employee: %s%n", worker);

        System.out.print("Which percentage to increase salary? ");
        worker.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s%n", worker);


        sc.close();

    }
}
