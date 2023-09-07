import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter: ");
        int a;
        if(!sc.hasNextInt()){
            System.out.println("Not a Integer");
        }
        else {
            System.out.println("It is a Integer");
        }
    }
}
