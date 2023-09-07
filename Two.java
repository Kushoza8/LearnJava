import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        while (!sc.hasNextInt()){
            sc.next();
//            it will be in the loop until integer is encountered.
        }
        int age= sc.nextInt();
//        the 10th line stores the valid integer and prints it in the next line
        System.out.println("your age is "+age);
    }
}
