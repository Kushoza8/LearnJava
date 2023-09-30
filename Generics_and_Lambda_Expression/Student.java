package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    //    @Override
//    public int compareTo(Student o) {
////        int diff= (int) (this.marks-o.marks)  ;
////        return  diff;
//
//
    public static void main(String[] args) {
        Comparator<Student> com=(i,j)->i.marks<j.marks?1:-1;
        Student student1=new Student(12,89.7F);
        Student student2=new Student(14,85.7F);
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student(1,12));
        arrayList.add(new Student(2,44));
        Collections.sort(arrayList,com);
        System.out.println(arrayList);

    }
}
