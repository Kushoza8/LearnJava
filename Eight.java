import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int a=sc.nextInt();
        int i;
        int j;
        //always put brackets in for loop
        for (i=0;i<a;i++)
            for (j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();

    }
}
