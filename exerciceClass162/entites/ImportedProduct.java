package exerciceClass162.entites;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }
    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs Fee: $ %.2f)", getName(), totalPrice(), getCustomsFee());
    }
}
