public class One_Oops {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        //Student Student1; //happens at compile time
        //new Student() happens at run time memory gets allocated
        //Student1 =new Student(); //(new keyword)->Dynamically allocates memory at runtime and returns a reference to it
        //Student1 is present in stack memory and points to variables inside it which are present in heap memory
        //Memory address access not allowed in java.
        Student Student1=new Student();
        Student1.rollno=42;
        Student1.name="Kush Oza";
        //Student1.marks= 71.42f; //default for float is 0.0f and for double is 0.0d
        System.out.println(Student1.rollno);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);
    }
}
//for every single student
class Student{
    int rollno;
    String name;
    float marks=90.12f;
}
