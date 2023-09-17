public class Static_Demo {
    //demo to show initialisation of static variable
    static  int a=4;
    static int b;
    static {
        System.out.println("I am in a static block");
        b=a*5;
    } //static will only run once when the object is created i.e. the class is loaded for the first time
    //this is clearly visible from the demo below
    //although 2 objects present but static runs only once

    public static void main(String[] args) {
        Static_Demo obj=new Static_Demo();
        System.out.println(Static_Demo.a+" "+Static_Demo.b);
        Static_Demo.b+=3;
        System.out.println(Static_Demo.a+" "+Static_Demo.b);
        Static_Demo obj2=new Static_Demo();
        System.out.println(Static_Demo.a+" "+Static_Demo.b);
    }
}