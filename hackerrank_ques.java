import java.util.Scanner;
public class hackerrank_ques{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i;
        int j;
        int a;
        int b;
        String str="kush";
        int n;
//        int sum=0;
        for (i=0;i<x;i++){
            a=sc.nextInt();
            b= sc.nextInt();
            n=sc.nextInt();
            int sum=a;
            for (j=0;j<n;j++){
                sum += (Math.pow(2, j) * b);
                System.out.println(sum);
            }

        }

    }
}