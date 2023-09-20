package com.kush.inheritance_demo;

public class BoxPrice extends BoxWeight {
    double cost;
    BoxPrice(){
        super();
        System.out.println("my price");
    }
    BoxPrice(double cost){
        this.cost=cost;
    }

    public BoxPrice(double l, double w, double h, String name, double cost) {
        super(l, w, h, name);
        this.cost = cost;
        System.out.println("I am grandchild");
    }
}
