import java.util.Scanner;
public class TwentyNine {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
            int i;
            char[] strArr=str.toCharArray();
            System.out.println("reversed string is: ");
            for (i=str.length()-1;i>=0;i--){
                System.out.print(strArr[i]);
            }
        }
    }

