package exerciceClass165.entites;

public abstract class TaxPayer {

    private String name;
    private Double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double payTax();
    public static Double MAX_TAX;
    public static Double MIN_TAX;

    @Override
    public String toString() {
        return String.format("%s: $%.2f", getName(), payTax());
    }
}
