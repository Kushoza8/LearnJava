import java.util.Scanner;
public class Thirteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        double area;
        double pi=3.14152;
        area=(6*(Math.pow(s,2)))/(4*Math.tan(pi/6));
        System.out.println("Area of Hexagon is "+area);
    }
}
