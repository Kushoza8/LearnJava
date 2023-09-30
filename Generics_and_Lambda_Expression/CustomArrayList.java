package Generics;
import java.util.ArrayList;
public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(45);
        arrayList.remove(0);
        arrayList.add(45);
        arrayList.add(50);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
    }
}
