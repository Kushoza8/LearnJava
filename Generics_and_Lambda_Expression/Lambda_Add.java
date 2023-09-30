package Generics;
interface Add{
    public void add(int a,int b);
}
public class Lambda_Add {
    public static void main(String[] args) {
//        Add add=new Add() {
//            @Override
//            public void add(int a, int b) {
//                int c=a+b;
//                System.out.println("Addition of "+a+" and "+b+" is "+c);
//            }
//        };
//        add.add(4,6); //non lambda expression
        Add add=(a,b)->{
            int c=a+b;
            System.out.println("addition of "+a+" and "+b+" is "+c);
        }; //lambda expression
        add.add(4,6);
    }
}
