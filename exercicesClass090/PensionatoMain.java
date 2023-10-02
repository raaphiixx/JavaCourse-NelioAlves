package exercicesClass090;

import java.util.Locale;
import java.util.Scanner;

public class PensionatoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] apartment = new String[9];

        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();

        Pensionato[] renter = new Pensionato[9];
        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String mail = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            renter[i] = new Pensionato(name, mail, room);
//            apartment[i] = renter[i].toString();
//            apartment[renter[i].getRoom()] = renter[i].toString();
            apartment[room] = renter[i].toString();
        }

        for (int i = 0; i < apartment.length; i++) {
            if (apartment[i] != null){
                System.out.println(apartment[i]);
            }
        }

        sc.close();
    }
}
