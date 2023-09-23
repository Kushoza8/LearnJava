import java.util.Locale;

public class Cmp_String {
    public static void main(String[] args) {
        String a="hello";
        String b="java";
        int i;
        i= a.compareTo(b);
        if(i<0){
            System.out.println("No");
        }
        System.out.print(a.replace(a.substring(0,1),a.substring(0,1).toUpperCase())+" ");
        System.out.print(b.replace(b.substring(0,1),b.substring(0,1).toUpperCase())+" ");

    }
}
