package Abstract_Class_Demo;

public class One extends Abstract_Class{
    @Override//overrides the method in abstract class it extends
    //static methods cannot be overridden and abstract methods are made to be overridden
    void hello() {
        System.out.println("Hello I am hello");
    }

    @Override //overrides the method in abstract class it extends
    void print() {
        System.out.println("Hello I am print");
    }

    public static void main(String[] args) {
        One o1=new One();

    }
}
