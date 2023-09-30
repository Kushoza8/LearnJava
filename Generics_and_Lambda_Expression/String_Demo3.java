package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class String_Demo3 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Kush");
        str.add("Jayesh");
        str.add("Gaitonde");
        str.add("Belsareya");

//        str.forEach((item)-> System.out.println(item));
//        for(String str1:str){
//            System.out.println(str1);
//        }
        Comparator<String> com=(o1,o2)->o1.length()>o2.length()?1:-1;
        System.out.println("simple filter");
        Collections.sort(str);
        System.out.println(str);
        System.out.println("custom filter");
        str.sort(com);
        System.out.println(str);
    }
}
