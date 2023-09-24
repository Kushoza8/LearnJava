package Protected_keyword_demo;

public class Sub_Class extends Class{
    public Sub_Class(int n, String name) {
        super(n, name);
    }

    public static void main(String[] args) {
        Class obj=new Class(12,"Kush");
        int n=obj.n; //no error within the same package
    }
}
