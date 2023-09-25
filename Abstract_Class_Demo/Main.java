package Abstract_Demo;

import static Abstract_Demo.Parent.hello;
//to use static methods import them like above.
import static Abstract_Demo.Parent.bye;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(34);
        son.career();
        son.partner();
        son.print();
        //Parent daughter=new Daughter(24); //method overriding
        Daughter daughter=new Daughter(18);
        daughter.career();
        daughter.partner();
        hello();
        bye();
        //Parent parent=new Parent(34); parent is abstract cannot be instantiated.
        //cannot create object of parent class.
        //abstract constructors are not allowed
        //you obviously cannot create abstract static methods
        //the general purpose of abstract methods is to get overridden
        //static methods cannot be overridden so abstract static methods cannot exist.
        //we can create static methods in abstract classes
        //rest all we can do.
    }
}
