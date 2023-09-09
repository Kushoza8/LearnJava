import java.util.Scanner;
public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= Math.abs(sc.nextInt());
        int b= Math.abs(sc.nextInt());
        int c= Math.abs(sc.nextInt());
        double a1,b1,c1;
        a1=a%10;
        b1=b%10;
        c1=c%10;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        if(a1==b1 || b1==c1 || c1==a1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
