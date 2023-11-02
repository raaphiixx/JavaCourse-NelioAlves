package exerciceClass162.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;
    DateTimeFormatter maskDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate.format(maskDate);
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), getManufactureDate());
    }
}
