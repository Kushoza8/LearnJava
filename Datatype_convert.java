import java.util.Scanner;
public class Datatype_convert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        String str=Integer.toString(a);
        if (sc.hasNext(str)){
            System.out.println("Good job");
        }
    }
}
