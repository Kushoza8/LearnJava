import java.util.Scanner;

public class Learning_User_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc =  new Scanner(System.in);
//        upper line important Scanner sc=new Scanner(system.in); creating a new instance is creating a new object
        System.out.println("enter number 1: ");
        int a = sc.nextInt();
        System.out.println("enter number 2: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.print("The sum of these numbers is ");
        System.out.print(sum);
        boolean d=sc.hasNextInt();
        System.out.println(d);
//        String input sc.nextInt
    }
}
