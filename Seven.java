import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter: ");
        int a= sc.nextInt();
        int i;
        for(i=0;i<=10;i++)
            System.out.println(a+" X "+i+" = "+ a*i);
    }
}
