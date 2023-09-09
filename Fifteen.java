//program to reverse a string
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String str= sc.nextLine();
        //sc.nextLine(); should be used read complete string.
        System.out.println("the original string is:  "+str);
        char[] strArray=str.toCharArray();
        int i;
        System.out.println(strArray.length);
        System.out.print("the reversed string is:  ");
        for (i=strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]);
        }
    }
}
