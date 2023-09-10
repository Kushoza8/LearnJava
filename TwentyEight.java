//Write a Java program to create another string of 4 copies of the last 3 characters of the original string.
// The original string length must be 3 and above.
import java.util.Scanner;
public class TwentyEight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String str1=str.substring(str.length()-3);
        System.out.println(str1);
        if (str.length()>3){
            System.out.println(str1+str1+str1+str1);
        }
        else {
            System.out.println("string size less than 3");
        }
    }
}
