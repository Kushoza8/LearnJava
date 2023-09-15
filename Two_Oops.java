public class Two_Oops {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Student2 kush=new Student2(42,"KushOza",65.45f);
        Student2 john=new Student2();
          //kush.rollno=42;
         //kush.name="Kush Oza";
        //kush.marks=71.34f;
        System.out.println(kush.rollno);
        System.out.println(kush.name);
        System.out.println(kush.marks);
        System.out.println(john.rollno);
        System.out.println(john.name);
        System.out.println(john.marks);
     // kush.changeName("KushRoza");
     //kush.greeting();


    }
}
class Student2{
    int rollno;
    String name;
    float marks;
    //we need a way to add the values of the above
    //properties object by object
    //we need one word to access every object.
    void greeting(){
        System.out.println("hello and welcome "+name);
    }
    void changeName(String new_name){
        name=new_name;
    }
    Student2(){
        this.rollno=42;
        this.name="Kush Oza";
        this.marks=71.33f;
    }
    Student2(int rno,String naam,float marks_sub){
        this.rollno=rno;
        this.name=naam;
        this.marks=marks_sub;
    }
}
