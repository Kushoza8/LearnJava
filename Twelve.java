//BINARY TO DECIMAL
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        double sum=0;
        int i=0;
        double b;
        int rem;
        while (a!=0){
            rem=a%10;
            b=rem*(Math.pow(2,i));
            sum=sum+b;
            i++;
            a=a/10;
        }
        System.out.println((int) sum); //typecasting final answer to integer to get the answer
    }
}
