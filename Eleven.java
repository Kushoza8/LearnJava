//USER INPUT IN JAVA IN ARRAY
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array which has binary value: ");
        int size= sc.nextInt();
        int i;
        int[] bin_num=new int[size];
        System.out.println("enter elements of array: ");
        for (i=0;i<size;i++){
            bin_num[i]= sc.nextInt();
        }
        for (i=0;i<size;i++) {
            System.out.println(bin_num[i]);
        }
    }
}
