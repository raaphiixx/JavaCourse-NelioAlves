package exercicesClass090;

public class Aprovados {

    private String name;
    private double grade1;
    private double grade2;

    public Aprovados(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double media() {
        return (grade1 + grade2) / 2;
    }
}
