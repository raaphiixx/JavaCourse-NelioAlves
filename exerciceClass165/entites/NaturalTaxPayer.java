package exerciceClass165.entites;

public class NaturalTaxPayer extends TaxPayer {
    private Double healthValue;
    public static Double MAX_TAX = 25.00;
    public static Double MIN_TAX = 15.00;

    public final Double HEALTH_VALUE = 50.00;

    public NaturalTaxPayer() {
        super();
    }

    public NaturalTaxPayer(String name, Double annualIncome) {
        super(name, annualIncome);
        this.healthValue = 0.0;
    }

    public NaturalTaxPayer(String name, Double annualIncome, Double healthValue) {
        super(name, annualIncome);
        this.healthValue = healthValue;
    }

    public Double getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(Double healthValue) {
        this.healthValue = healthValue;
    }

    @Override
    public Double payTax() {
        if (getAnnualIncome() < 20000.00) {
            return getAnnualIncome() * (MIN_TAX / 100);
        } else if (getAnnualIncome() >= 20000.00 && healthValue > 0) {
            double healthDiscount = getHealthValue() * (HEALTH_VALUE / 100);
            return (getAnnualIncome() * (MAX_TAX / 100)) - healthDiscount;
        } else {
            return getAnnualIncome() * (MAX_TAX / 100);
        }
    }
}
