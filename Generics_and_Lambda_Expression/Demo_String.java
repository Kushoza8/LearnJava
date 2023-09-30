package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo_String {
    public static void main(String[] args) {
//        Comparator<String> com=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()>o2.length()){
//                    return 1;
//                }
//                else {
//                    return -1;
//                }
//            }
//        };
        Comparator<String> com=(i,j)->i.length()>j.length()?1:-1; //lambda expression
        ArrayList<String> str=new ArrayList<>();
        str.add("Kush");
        str.add("Jayesh");
        str.add("Gaitonde");
        str.add("Belsareya");
        //for sorting you need to import collections
        System.out.println("Unsorted");
        System.out.println(str);
        System.out.println("Sorted");
        Collections.sort(str);
        System.out.println(str);
        System.out.println("Custom Sorting");
        str.sort(com);
        System.out.println(str);
    }
}

