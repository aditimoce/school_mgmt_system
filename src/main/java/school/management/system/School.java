package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    // method to add a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    // method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // method to add money earned to the school
    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // method to update the money spent by the school on teacher's salaries
    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
