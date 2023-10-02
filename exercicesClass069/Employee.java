package exercicesClass069;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return this.grossSalary - tax;
    }

    public void IncreaseSalary (double percent) {
        this.grossSalary += (grossSalary * 10) / 100;
    }

    public String toString(){
        return this.name
                + String.format(", $ %.2f", NetSalary());
    }

}
