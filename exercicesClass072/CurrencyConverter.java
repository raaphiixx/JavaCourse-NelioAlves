package exercicesClass72;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static String realPrice(double dollarPrice, double dollar){
        double finalPrice = dollarPrice * dollar;
        return String.format("%.2f", finalPrice += (finalPrice * IOF));
    }
}
