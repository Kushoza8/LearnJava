import java.util.Locale;
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        char grade='B';
        Scanner sc=new Scanner(System.in);
        //to encrypt
        grade=(char)(grade+8);
        //the 5th line is known as typecasting
        System.out.println(grade);
        //character+integer is always an integer
        //can be converted to char by typecasting
        //to decrypt
        grade=(char)(grade-8);
        System.out.println(grade);
        String str="My name is Kush Oza";
        System.out.println(str);
        String str1= sc.nextLine();
        System.out.println(str1);
        //sc.next() reads only one word sc.nextLine() reads till we encounter line break like \n.
        int a=4;
        double x=4.5678;
        System.out.printf("the value of a is %d and values of x is %f ",a,x);
        //format specifier printf and format is same
        System.out.format("\nhello\n");
        System.out.println(str.toUpperCase());
        int i=0;
        for (i=0;i<5;i++)
            System.out.println("Hello world");
        
    }
}
