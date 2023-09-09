import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
        //convert the input of longitude and latitude to radians;
        //arccos means inverse of cos in java it is written as Math.acos();
        System.out.println("enter: ");
        double lat1= sc.nextDouble();
        System.out.println("enter: ");
        double lon1= sc.nextDouble();
        System.out.println("enter: ");
        double lat2= sc.nextDouble();
        System.out.println("enter: ");
        double lon2= sc.nextDouble();
        lat1=Math.toRadians(lat1);
        lat2=Math.toRadians(lat2);
        lon1=Math.toRadians(lon1);
        lon2=Math.toRadians(lon2);
        double distance;
        double radius=6371.01;
        distance=(radius)*Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1-lon2));
        System.out.println("The distance between the points is "+distance);
    }
}
