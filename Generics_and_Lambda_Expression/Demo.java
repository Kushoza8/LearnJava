package Generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(41);
        arr.add(18);
        arr.add(62);
        arr.add(14);
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(41);
        arr1.add(18);
        arr1.add(62);
        arr1.add(14);
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        System.out.println(arr); //order in which written
        Collections.sort(arr);
        System.out.println(arr); //this is default sorting
        //if you need to specify the condition you need for sorting then you use comparator operator
        System.out.println("conditional sorting");
        arr.sort(com);
        System.out.println(arr);

        Collections.sort(arr1,com);
        System.out.println("new arr");
        System.out.println(arr1);
    }
}
