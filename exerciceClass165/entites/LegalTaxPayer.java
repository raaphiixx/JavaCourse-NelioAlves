package exerciceClass165.entites;

public class LegalTaxPayer extends TaxPayer {
    private Integer quantityEmployees;

    public static Double MAX_TAX = 16.00;
    public static Double MIN_TAX = 14.00;

    public LegalTaxPayer() {
        super();
    }

    public LegalTaxPayer(String name, Double annualIncome, Integer quantityEmployees) {
        super(name, annualIncome);
        this.quantityEmployees = quantityEmployees;
    }

    public Integer getQuantityEmployees() {
        return quantityEmployees;
    }

    public void setQuantityEmployees(Integer quantityEmployees) {
        this.quantityEmployees = quantityEmployees;
    }

    @Override
    public Double payTax() {
        if(getQuantityEmployees() < 10) {
            return getAnnualIncome() * (MAX_TAX / 100);
        } else {
            return getAnnualIncome() * (MIN_TAX / 100);
        }
    }

}
