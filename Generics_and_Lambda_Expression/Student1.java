package Generics;

import java.util.ArrayList;

public class Student1 {
    int roll;
    String name;

    public Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Student1(12,"Kush"));
        System.out.println(new Student1(25,"Jayesh"));
        System.out.println(new Student1(86,"Belsareya"));
        System.out.println(new Student1(34,"Gaitonde"));
        ArrayList<Student1> student=new ArrayList<>();
        student.add(new Student1(12,"Kush"));
        student.add(new Student1(25,"Jayesh"));
        student.add(new Student1(86,"Belsareya"));
        student.add(new Student1(34,"Gaitonde"));
    }
}
