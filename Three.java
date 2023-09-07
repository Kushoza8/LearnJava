//ADDITION OF THREE NUMBERS USING JAVA.
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        String name;
        System.out.println("enter: ");
        a= sc.nextInt();
        System.out.println("enter: ");
        b= sc.nextInt();
        System.out.println("enter: ");
        c= sc.nextInt();
        d=a+b+c;
        System.out.println("the sum is "+d);
        name=sc.next();
        System.out.println("Hello "+name+" how you doing?");
    }
}
