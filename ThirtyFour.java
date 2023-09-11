import java.util.Scanner;

public class ThirtyFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.substring(1)+str2.substring(1));
    }
}
