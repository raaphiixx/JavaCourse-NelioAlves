package exercicesClass69;

import java.util.Locale;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student people = new Student();
        Student people2 = new Student();

        System.out.print("Input your Name: ");
        people.name = sc.nextLine();

        /*
        System.out.println("Input the Grades: ");
        people.grade1 = sc.nextDouble();
        people.grade2 = sc.nextDouble();
        people.grade3 = sc.nextDouble();
         */

        people2 = people;
        System.out.printf("Student 1 NAME: %s%n", people.name);
        System.out.printf("Student 2 NAME: %s%n", people2.name);
        System.out.println("CHANGING VALUES");
        System.out.print("Type the new name: ");
        people.name = sc.nextLine();
        System.out.printf("Student 1 NEW NAME: %s%n", people.name);
        System.out.printf("Student 2 NEW NAME: %s%n", people2.name);

        /*
        System.out.printf("FINAL GRADE = %.2f%n", people.FinalGrade());
        System.out.printf("%s", people.Pass());
        sc.close();
        */
    }
}
