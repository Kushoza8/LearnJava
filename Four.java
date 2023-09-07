import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("enter: ");
        a= sc.nextFloat();
        b=a*1.60934;
        System.out.println(a+" miles");
        System.out.println("distance is "+b+" kilometres");
    }
}
