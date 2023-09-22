package exercicesClass81.exercicesClass81Application;

import exercicesClass81.exercicesClass81Entites.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankServices {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int accountNumber;
        String userName;
        char userChoice;

        System.out.print("Account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        userName = sc.nextLine();

        BankAccount alex = new BankAccount(accountNumber, userName);

        System.out.print("Is there any inital deposit (y/n) / (Y/N)? ");
        userChoice = sc.next().charAt(0);
        if (userChoice == 'y' || userChoice == 'Y') {
            System.out.print("Initial Deposit: ");
            alex.deposit(sc.nextDouble());
        }
        System.out.println();

        System.out.println("Account Data:");
        System.out.println(alex);

        System.out.println();
        System.out.print("Deposit value: ");
        alex.deposit(sc.nextDouble());
        System.out.print("Updated Account:");
        System.out.println(alex);

        System.out.println();
        System.out.print("Withdraw value: ");
        alex.withdraw(sc.nextDouble());
        System.out.print("Updated Account:");
        System.out.println(alex);

        sc.close();
    }
}
