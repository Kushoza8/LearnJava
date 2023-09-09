//print odd number between start and end limit
import java.util.Scanner;
public class TwentyOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter start: ");
        int a=sc.nextInt();
        System.out.println("enter end: ");
        int b= sc.nextInt();
        for(i=a;i<=b;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}
