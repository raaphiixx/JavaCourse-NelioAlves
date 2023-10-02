package exercicesClass69;

import java.util.Locale;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle geometricForm = new Rectangle();


        System.out.println("Enter rectangle width and height: ");
        geometricForm.width = sc.nextDouble();
        geometricForm.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", geometricForm.Area());
        System.out.printf("PERIMETER = %.2f%n", geometricForm.Perimeter());
        System.out.printf("DIAGONAL = %.2f", geometricForm.Diagonal());

        sc.close();

    }
}
