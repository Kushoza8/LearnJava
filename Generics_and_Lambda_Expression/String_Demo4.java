package Generics;

public class String_Demo4 implements Comparable<String_Demo4>{
    int roll;
    String name;

    public String_Demo4(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(String_Demo4 o) {
        if (this.roll>o.roll){
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String_Demo4 strDemo4=new String_Demo4(20,"Kush");
        String_Demo4 strDemo5=new String_Demo4(16,"Jayesh");
        int x=strDemo5.compareTo(strDemo4);
        System.out.println(x);
    }
}
