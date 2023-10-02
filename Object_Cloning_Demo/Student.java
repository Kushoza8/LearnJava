package Object_Cloning_Demo;
public class Student{
    int roll;
    String name;
    int x;

    public Student(int roll, String name,int x) {
        this.x=x;
        this.roll = roll;
        this.name = name;
    }
    public Student(Student old){
        this.roll=old.roll;
        this.name=old.name;
        this.x=old.x;
    }
    public static void main(String[] args) {
        Student student=new Student(12,"KUSH",5);
        System.out.println(student.x+" "+student.roll+" "+student.name);
        Student student1=new Student(student);
        System.out.println(student1.x+" "+student1.roll+" "+student1.name);
    }
}
