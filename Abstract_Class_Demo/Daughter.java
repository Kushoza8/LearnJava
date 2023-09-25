package Abstract_Demo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("i want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
