package school.management.system;

/**
 * class for keeping track of students, student's taxes, name and grades
 */

public class Student {

    private int id;
    private String name;
    private double grade;
    private double paidTaxes;
    private double totalTaxes;

    public Student(int id, String name, int grade) {
        this.paidTaxes = 0;
        this.totalTaxes = 8500;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getPaidTaxes() {
        return paidTaxes;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public void setPaidTaxes(double taxes) {
        paidTaxes += taxes;
    }

    public void payTaxes(double taxes) {
        paidTaxes += taxes;
        School.updateTotalMoneyEarned(paidTaxes);
    }

    public double getRemainingTaxes() {
        return totalTaxes-paidTaxes;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far: "+ paidTaxes;
    }
}
