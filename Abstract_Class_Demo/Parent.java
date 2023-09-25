package Abstract_Demo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    void print(){
        System.out.println("hello print method");
    }
     static void hello(){
        System.out.println("final hello bhai");
    }
    static void bye(){
        System.out.println("final wala bye bhai");
    }
    abstract void career();
    abstract void partner();
}
