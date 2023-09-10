// Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
//Sample Output:Python Tutorial 3.0
import java.util.Scanner;
public class TwentySeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1= sc.nextLine();
        String str2=str.substring(0,str.length()/2+1)+" "+str1+str.substring(str.length()/2+1);
        System.out.println(str2);
    }
}
