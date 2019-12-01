package school.management.system;

/**
 * class for keeping track of teachers
 */

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double earnedSalary;

    public double getEarnedSalary() {
        return earnedSalary;
    }

    public void setEarnedSalary(double earnedSalary) {
        this.earnedSalary = earnedSalary;
    }

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // teacher gets paid. salary amount must get subtracted from the money the school has earned so far
    public void getPaid(double salary) {
        earnedSalary += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teachers's name: "+name+
                " Total salary earned so far: "+ earnedSalary;
    }
}
