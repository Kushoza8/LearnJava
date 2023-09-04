//CALCULATING PERCENTAGE FROM GIVEN MARKS IN 5 SUBJECTS. TAKE USER INPUT OF MARKS.

import java.util.Scanner;
public class Learning_user_Input1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d,e;
        float sum;
        float f;
        System.out.println("enter first sub. marks: ");
        a=sc.nextInt();
        System.out.println("enter second sub. marks: ");
        b= sc.nextInt();
        System.out.println("enter third sub. marks: ");
        c= sc.nextInt();
        System.out.println("enter fourth sub. marks: ");
        d= sc.nextInt();
        System.out.println("enter fifth sub. marks: ");
        e= sc.nextInt();
        sum=a+b+c+d+e;
        f=(sum/500)*100;
        System.out.println("The percentage of given marks are: "+f);
    }
}
