//to check if number is prime or composite
import java.util.Scanner;
public class TwentyFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a= sc.nextInt();
        int i;
        int count=2;
        if (a==1){
            System.out.println("neither prime nor composite");
        }
        for (i=2;i<a;i++){
            if (a%i==0){
                count++;
            }
        }
        if(a!=1){
            if (count > 2) {
                System.out.println("COMPOSITE");
            } else {
                System.out.println("PRIME");
            }
        }
    }
}
