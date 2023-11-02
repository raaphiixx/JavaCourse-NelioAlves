package exerciceClass162;

import exerciceClass162.entites.ImportedProduct;
import exerciceClass162.entites.Product;
import exerciceClass162.entites.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter maskDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Product #"+ (i+1) +" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (typeProduct == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                list.add(product);
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String manufactureDate = sc.nextLine();
                Product product = new UsedProduct(name, price, LocalDate.parse(manufactureDate, maskDate));
                list.add(product);

            } else {
                Product product = new Product(name, price);
                list.add(product);
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS: ");
        for (Product item: list) {
            System.out.println(item.priceTag());
        }

    }
}
