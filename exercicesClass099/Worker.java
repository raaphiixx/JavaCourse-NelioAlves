package exercicesClass99;

public class Worker {

    private Integer id;
    private String name;
    private Double salary;

    public Worker (Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary (Double percent) {
        this.salary += salary * (percent / 100);
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", $" + this.salary;
    }
}
