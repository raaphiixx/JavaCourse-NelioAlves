package exerciceClass152;

import examples.enums.OrderStatus;
import exerciceClass152.entites.Client;
import exerciceClass152.entites.Order;
import exerciceClass152.entites.OrderItem;
import exerciceClass152.entites.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateClient = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateOrder = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter Client Data");
        System.out.print("Name: ");
        String name = sc.nextLine();
//        String name = "Rapha";
        System.out.print("Email: ");
        String email = sc.nextLine();
//        String email = "Raph@";
        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateBirth = sc.nextLine();
//        String dateBirth = "07/05/1997";
        Client client = new Client(name, email, LocalDate.parse(dateBirth, dateClient));

//        System.out.println(client.getBirthDate());

        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order order = new Order(OrderStatus.valueOf(status), client);
        System.out.print("How many itens to this order? ");
        int quantityOrder = sc.nextInt();
        for (int i = 0; i < quantityOrder; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Product Quantity: ");
            Integer productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();


        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        sc.close();
    }
}
