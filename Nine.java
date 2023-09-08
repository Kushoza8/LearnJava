import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to convert: ");
        int a= sc.nextInt();
        int b=a;
        int i=0;
        int j;
        int[] bin_num =new int[100]; //this is how you declare array in java
        while (b!=0) //run loop till b>0.
        {
            bin_num[i]=b%2; //store remainder of operation in array
            b=b/2; //reduce the value like 5 converts to 2 when 5/2. quotient is 2
            i++; //increment array position
        }
        for (j=i-1;j>=0;j--) { //print value of binary.
            System.out.print(bin_num[j]);
        }
        //we print the loop in reverse order because that is the method therefore loop is used to print in reverse order.

    }
}
