import java.util.Locale;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Exercices {
    public static void main(String[] args) {

        // Section 4 - Class 23

        /*
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n", product1, price1, product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("%nMeasue with eight decimal places: %.8f%nRounded (threee decimal places): %.3f", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%nUS decimal point: %.3f", measure);
        */

        /*
        System.out.println(">> Section 4 - Class 29 <<");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        */

        /*
        System.out.println("Exercicio 01");
        int x, y, soma;
        System.out.print("Digite dois numeros inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;
        System.out.printf("SOMA = %d", soma);
        sc.close();
        */

        /*
        System.out.println("Exercicio 02");
        double raio, total, pi = 3.14159;
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        total = pi * Math.pow(raio, 2);
        System.out.printf("A = %.4f", total);
        */

        /*
        System.out.println("Exercicio 03");
        int a, b, c, d, diferenca;
        System.out.print("Digie quatro valores inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca = a * b - c * d;
        System.out.printf("DIFERENCA = %d", diferenca);
        */

        /*
        System.out.println("Exercicio 04");
        int hour, number;
        double salary, hsalary;
        System.out.print("Digite seu número, a quantidade de horas trabalhadas e o valor por hora: ");
        number = sc.nextInt();
        hour = sc.nextInt();
        hsalary = sc.nextDouble();
        salary = hour * hsalary;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", number, salary);
        */

        /*
        System.out.println("Exercicio 05");
        int cod1, cod2, unit1, unit2;
        double price1, price2, total;
        System.out.println("Digite o codigo do artigo, a quantidade e o valor de ambos produtos:");
        cod1 = sc.nextInt();
        unit1 = sc.nextInt();
        price1 = sc.nextDouble();
        sc.nextLine();
        cod2 = sc.nextInt();
        unit2 = sc.nextInt();
        price2 = sc.nextDouble();
        total = (unit1 * price1) + (unit2 * price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        */

        /*
        System.out.println("Exercicio 06");
        double a, b, c, triangle, circle, trapezoid, square, rectangle,  pi = 3.14159;
        System.out.print("Digite os valores de A, B, C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        triangle = (a * c / 2);
        circle = (Math.pow(c, 2) * pi);
        trapezoid = ((a + b) * c / 2);
        square = Math.pow(b, 2);
        rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoid);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
        */

        /*
        System.out.println(">> Section 5 - Class 36 <<");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        */

        /*
        System.out.println("Exercicio 01");
        int number;
        System.out.print("Digite um numero inteiro: ");
        number = sc.nextInt();
        if (number >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        */

        /*
        System.out.println("Exercicio 02");
        int number;
        System.out.print("Digite um numero inteiro: ");
        number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        */

        /*
        System.out.println("Exercicio 03");
        int a, b;
        System.out.print("Digite o dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        */

        /*
        System.out.println("Exercicio 04");
        int hourInitial, hourFinal, hourCalc, hour = 24;
        System.out.print("Digite a hora inicial e hora final: ");
        hourInitial = sc.nextInt();
        hourFinal = sc.nextInt();
        if (hourInitial <= 24 && hourFinal <= 24) {
            if (hourInitial > hourFinal) {
                hourCalc = hour - hourInitial + hourFinal;
                System.out.printf("O JOGO DUROU %d HORA(S)", hourCalc);
            } else if (hourInitial == hourFinal) {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            } else {
                hourCalc = hourFinal - hourInitial;
                System.out.printf("O JOGO DUROU %d HORA(S)", hourCalc);
            }
        } else {
            System.out.println("Hora incompativel");
        }
        */

        /*
        System.out.println("Exercicio 05");
        int cod, quantity;
        float total;
        System.out.println("| CODIGO |  ESPECIFICAÇÃO   |  PREÇO  |");
        System.out.println("| 1      | CACHORRO QUENTE  | R$ 4.00 |");
        System.out.println("| 2      | X-SALADA         | R$ 4.50 |");
        System.out.println("| 3      | X-BACON          | R$ 5.00 |");
        System.out.println("| 4      | TORRADA SIMPLES  | R$ 2.00 |");
        System.out.println("| 5      | REFRIGERANTE     | R$ 1.50 |");
        System.out.println();
        System.out.print("Digite o codigo do produto e quantidade consumida: ");
        cod = sc.nextInt();
        quantity = sc.nextInt();
        if (cod == 1){
            total = (float) 4.00 * quantity;
            System.out.printf("TOTAL: R$ %.2f", total);
        } else if (cod == 2) {
            total = (float) 4.50 * quantity;
            System.out.printf("TOTAL: R$ %.2f", total);
        } else if (cod == 3) {
            total = (float) 5.00 * quantity;
            System.out.printf("TOTAL: R$ %.2f", total);
        } else if (cod == 4) {
            total = (float) 2.00 * quantity;
            System.out.printf("TOTAL: R$ %.2f", total);
        } else if (cod == 5){
            total = (float) 1.50 * quantity;
            System.out.printf("TOTAL: R$ %.2f", total);
        } else{
            System.out.println("Codigo Invalido");
        }
        */

        /*
        System.out.println("Exercicio 06");
        double value;
        System.out.print("Digite um intervalo: ")
        value = sc.nextDouble();
        if (value < 0 || value > 100){
            System.out.println("Fora de intervalo");
        } else if (value <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if(value <= 50){
            System.out.println("Intervalo [25,50]");
        } else {
            System.out.println("Intervalo [75,100]");
        }
        */

        /*
        System.out.println("Exercicio 07");
        float a, b;
        System.out.println("Digite as coordenadas: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("Origem");
        } else if (a > 0 && b == 0) {
            System.out.println("Eixo X");
        } else if (b > 0 && a == 0) {
            System.out.println("Eixo Y");
        } else if (a > 0 && b > 0) {
            System.out.println("Q1");
        } else if (a > 0 && b < 0) {
            System.out.println("Q4");
        } else if (a < 0 && b > 0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q3");
        }
        */

        /*
        System.out.println("Exercicio 08");
        double salary, tax, tax8 = 0.08, tax18 = 0.18, tax28 = 0.28;
        System.out.print("Digite seu salario: ");
        salary = sc.nextDouble();
        if (salary <= 2000) {
            System.out.println("Isento");
        } else if (salary <= 3000) {
            tax = (salary -2000) * tax8;
            System.out.printf("€ %.2f", tax);
        } else if (salary <= 4500) {
            tax = (salary - 3000) * tax18 + (1000 * tax8);
            System.out.printf("€ %.2f", tax);
        } else {
            tax = (salary - 4500) * tax28 + (1500 * tax18) + (1000 * tax8);
            System.out.printf("€ %.2f", tax);
        }
        */

        /*
        System.out.println(">> Section 6 - Class 48 <<");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        */

        /*
        System.out.println("Exercicio 01");
        int password;
        System.out.print("Digite a senha: ");
        password = sc.nextInt();
        while (password != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Digite a senha: ");
            password = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        */

        /*
        System.out.println("Exercicio 02");
        int x = 1, y = 1;
        while (x != 0 && y != 0) {
            System.out.print("Digite as coordenadas X, Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
        }
        */

        /*
        System.out.println("Exercicio 03");
        int alcohol = 0, gasoline = 0, diesel = 0, choice = 0;
        System.out.println("Opções: ");
        System.out.println("1 - Alcool | 2 - Gasolina");
        System.out.println("3 - Diesel | 4 - Fim");
        while (choice != 4){
            System.out.print("Escolha seu TIPO: ");
            choice = sc.nextInt();
            if (choice == 1) {
                alcohol ++;
            } else if (choice == 2) {
                gasoline ++;
            } else if (choice == 3) {
                diesel ++;
            } else if (choice > 4) {
                System.out.println("Opção Invalida!");
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcohol);
        System.out.printf("Gasolina: %d%n", gasoline);
        System.out.printf("Diesel: %d%n", diesel);
        */

        /*
        System.out.println(">> Section 6 - Class 53 <<");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         */

        /*
        System.out.println("Exercicio 01");
        System.out.print("Digite um numero inteiro: ");
        int number = sc.nextInt();
        for (int c = 0; c <= number; c++) {
            if (c % 2 != 0) {
                System.out.println(c);
            }
        }
        */

        /*
        System.out.println("Exercicio 02");
        System.out.print("Digite a quantidade de numeros inteiros que devem ser lidos: ");
        int count = sc.nextInt();
        int in = 0, out = 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("Digite o %dº numero: ", i);
            int number = sc.nextInt();
            if (number >= 10 && number <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d IN%n", in);
        System.out.printf("%d OUT", out);
        */

        /*
        System.out.println("Exercicio 03");
        System.out.print("Quantos notas serão lidas ? ");
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite as notas: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("%.1f%n", media);
        }
        */

        /*
        System.out.println("Exercicio 04");
        System.out.print("Digite a quantidade de números a serem divididos: ");
        int quantity = sc.nextInt();
        for (int count = 0; count < quantity; count++) {
            System.out.print("Digite dois numeros: ");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            if (n2 == 0) {
                System.out.println("Divisão Impossivel");
            } else {
                double div = n1 / n2;
                System.out.println(div);
            }
        }
        */

        /*
        System.out.println("Exercicio 05");
        System.out.print("Digite um numero: ");
        int number = sc.nextInt();
        int fat = 1;
        for (int i = number; i > 0; i--) {
            if (number == 0) {
                fat = 1;
            }
            fat *= i;
        }
        System.out.println(fat);
        */

        /*
        System.out.println("Exercicio 06");
        System.out.print("Digite um numero: ");
        int number = sc.nextInt();
        for (int i = number; i > 0; i--) {
            if (number % i == 0){
                System.out.println(i);
            }
        }
        */

        /*
        System.out.println("Exercicio 07");
        System.out.print("Digite um numero inteiro positivo: ");
        int number = sc.nextInt();

        for (double c = 0; c <= number; c++) {
            System.out.printf("%.0f %.0f %.0f%n", c, Math.pow(c, 2), Math.pow(c, 3));
        }
        */


        /*
        int read = 0b0001;
        int write = 0b0010;
        int execute = 0b0100;
        int delete = 0b1000;

        int userPermissions = read | write;

        System.out.println(userPermissions);
        */
        /*
        String list = "APPLE ORANGE BANANA";
        String [] list2 = list.split("\s");
        System.out.println(list2[0]);
        */

        //sc.close(); // Close the Scanner
    }
}