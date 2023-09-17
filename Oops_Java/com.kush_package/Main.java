package com.kush_package;
//object independent is known as static variable.
public class Main {
    public static void main(String[] args) {
        Human kush = new Human(21, "Kush Oza", 10000, false);
        Human kunal = new Human(21, "Kunal", 15000, false);
        System.out.println(Human.population);
        //to print a static variable always use (classname.variablename) as default syntax.don't use object variable
        //static variable belong to the object and not the variable
        greeting();
        Main o1=new Main();
        o1.fun2();
    }
    static void greeting() {
        System.out.println("hello and welcome");
        //you cannot access non-static stuff without referencing their instances a static context
        //Main obj=new Main();
        //obj.hello();
    }
    void hello(){
        System.out.println("hello world");
        //greeting(); //static method declared inside non static
    }
    void fun2(){
        hello();
    }
    //non-static are dependent on objects
    //static are not dependent on objects
    //cannot use non-static inside a static
    //greeting() is object independent.
    //but we can use static inside a non-static method no problem there
    //static ke saath this and final nhi chlta.
}


