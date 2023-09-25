package Abstract_Demo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }
    void print() {
        super.print();
    }
    @Override
    void partner() {
        System.out.println("I love Brie");
    } //child class overriding the methods that are present in the parent class.
}
