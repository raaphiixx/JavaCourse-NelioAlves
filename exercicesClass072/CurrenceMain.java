package exercicesClass072;
import java.util.Locale;
import java.util.Scanner;

public class CurrenceMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollarPrice, dollarMontant;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        dollarMontant = sc.nextDouble();
        System.out.print("Amount to be paid in reais = ");
        System.out.println(CurrencyConverter.realPrice(dollarPrice, dollarMontant));


        sc.close();
    }
}
