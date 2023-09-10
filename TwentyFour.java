//String array important
import java.util.Scanner;
public class TwentyFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of string: ");
        int n=sc.nextInt();
        sc.nextLine();   //most important if you dont put this it will take newline char \n as input most important to use while using string array
        int i;
        String[] str=new String[n];
        for (i=0;i<n;i++){
            str[i]= sc.nextLine();
        }
        for (i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
