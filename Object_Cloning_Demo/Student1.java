package Object_Cloning_Demo;
public class Student1 implements Cloneable{
    int roll;
    String name;

    public Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 student1=new Student1(12,"Kush");
        Student1 student12=(Student1)student1.clone();
        System.out.println(student12.name+" "+student12.roll);
    }
}
