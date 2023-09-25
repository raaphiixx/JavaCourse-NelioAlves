package exercicesClass99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class WorkerMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Worker> employee = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d°:%n", i+1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Boolean idCheck = idExists(employee, id);
            if (idCheck) {
                System.out.println("ID Invalid!");
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                employee.add(new Worker(id, name, salary));
            }
        }

        System.out.println();
        System.out.println("Increase Salary");
        System.out.print("Employee ID: ");
        int idIncrease = sc.nextInt();
        Worker idSalary = employee.stream().filter(x -> x.getId().equals(idIncrease)).findAny().orElse(null);
        if (idSalary != null) {
            System.out.print("Percent: ");
            double percent = sc.nextDouble();
            idSalary.increaseSalary(percent);
        } else {
            System.out.println("This ID doesn't exists");
        }
        System.out.println();

        System.out.println("Employee List: ");
        for (Worker person: employee) {
            System.out.println(person);
        }
        sc.close();

    }

    public static Boolean idExists(List<Worker> workers, int id) {
        Worker idCheck = workers.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        return idCheck != null;
    }

}
