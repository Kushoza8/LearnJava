import java.util.Scanner;
public class ThirtySix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int i;
        String str1=" ";
        String[] strArr=new String[n];
        for (i=0;i<n;i++){
            strArr[i]= sc.nextLine();
        }
        for (i=0;i<n;i++){
            System.out.print(strArr[i]+" ");
        }
        System.out.println("\n");
        for (i=0;i<n;i++){
            System.out.print(strArr[i].replace(strArr[i].substring(0,1),strArr[i].substring(0,1).toUpperCase())+" ");       }

    }
}
