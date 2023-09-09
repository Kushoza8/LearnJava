//Write a Java program to accept an integer and count the factors of the number.
import java.util.Scanner;
public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter: ");
        int a= sc.nextInt();
        int i;
        int count=2;
        for (i=2;i<a;i++){
            if (a%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
