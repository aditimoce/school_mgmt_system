package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ion Vasile", 3450.70);
        Teacher teacher2 = new Teacher(2, "Bogdan Vintila", 2690.20);
        Teacher teacher3 = new Teacher(3, "Monica Pop", 3240.80);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1, "Alex Pop", 8);
        Student student2 = new Student(2, "Andrei Popa", 9);
        Student student3 = new Student(3, "Mihai Popescu", 7);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School school1 = new School(teacherList, studentList);

        student1.payTaxes(3500);
        student2.payTaxes(2000);
        System.out.println("School has earned: " + school1.getTotalMoneyEarned());

        // school pays salaries to teacher; add sout method to display how much the school has left in the bank
        System.out.println("School pays salaries to teachers:");
        teacher1.getPaid(teacher1.getSalary());
        System.out.println(teacher1.getName() + " was paid " + teacher1.getSalary());
        System.out.println("School has left in the bank " + school1.getTotalMoneyEarned());
        System.out.println(student1);
        System.out.println(teacher1);
    }
}
