package Generics;
interface Sayable {
    public void sayable(String name);
}
//we are using concept of anonymous classes as they can be used to instantiate an interface.
//we will also use lambda expression to make the statement easier so we have to write less code.
public class Lambda_Demo1 {
    public static void main(String[] args) {
        Sayable s=(name)->{System.out.println("I have only this much to say "+name);};
        s.sayable("Kush");
        s.sayable("Jayesh");
    }

}
