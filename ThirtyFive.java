import java.util.Scanner;
public class ThirtyFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n= sc.nextInt();
        if (n>=2) {
            int[] arr1 = new int[n];
            int i;
            System.out.println("enter the elements in the array: ");
            for (i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                System.out.println("element: " + i + " = " + arr1[i]);
            }
            if (arr1[0]==10 || (arr1[arr1.length-1])==10){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("array length must be greater than 2");
        }

    }
}
