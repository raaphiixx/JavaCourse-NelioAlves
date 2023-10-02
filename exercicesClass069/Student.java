package exercicesClass069;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double FinalGrade (){
        return grade1 + grade2 + grade3;
    }

    public String Pass() {
        return String.format(FinalGrade() > 60.00 ? "PASS" : "FAILED%nMISSSING %.2f POINTS", 60 - FinalGrade());
    }

}
