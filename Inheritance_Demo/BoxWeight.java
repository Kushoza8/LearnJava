package com.kush.inheritance_demo;

public class BoxWeight extends Box{
    String name;
    BoxWeight(){
        super();
        System.out.println("hello oza");
    }
    BoxWeight(double l,String name){
        super(l);
        this.name=name;
        System.out.println("my name is "+name+" "+"and length is "+l);
    }
    BoxWeight(double l,double w,double h,String name){
        super(l, w, h);
        System.out.println("I am child");
        this.name=name;
    }
}
