import java.util.Scanner;
public class ThirtyThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2= sc.nextLine();
        if (str1.isEmpty()){
            System.out.println("#"+str2);
        }
        else {
            System.out.println(str1+"#");
        }

    }
}
