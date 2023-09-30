package Generics;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i;
        for (i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        for(Integer item: arr){
            System.out.println(item);
        } //demo foreach loop

        arr.forEach((item)-> System.out.println(item*2));
    }
}

