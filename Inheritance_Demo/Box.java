package com.kush.inheritance_demo;

public class Box {
    double l;
    double w;
    double h;
    public Box(){
        System.out.println("hello kush");
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println("I am grandparent");
    }
    public Box(double l){
        this.l=l;
        System.out.println("My Box length");
    }
}
