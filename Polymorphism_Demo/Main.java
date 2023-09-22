package kush.com_polymorphism_Demo;

public class Main {
    public static void main(String[] args) {
        Shapes s1=new Shapes();
        Shapes s2=new Square();
        Shapes c1=new Circle();
        s1.area();
        s2.area();
        c1.area();
    }
}
