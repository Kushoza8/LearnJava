//typecasting string to integer
import java.util.Scanner;
public class Nineteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n= sc.nextLine();
        String a=n+n;
        String b=n+n+n;
        int x=Integer.parseInt(n);
        int y=Integer.parseInt(a);
        int z=Integer.parseInt(b);
        int sum=x+y+z;
        System.out.println("Addition is "+x+"+"+y+"+"+z+" is = "+sum);


    }
}
