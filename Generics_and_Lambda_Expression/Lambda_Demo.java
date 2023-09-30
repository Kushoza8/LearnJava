package Generics;
import java.util.ArrayList;
public class Lambda_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(48);
        arr.add(34);
        arr.add(98);
        arr.forEach((text)-> System.out.println(text*2));
    }
}
