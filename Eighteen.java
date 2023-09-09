//printing ASCII values for alphabets A to Z
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x='A';
        char y='A';
        int i;
        for (i=0;i<25;i++){
            System.out.println("ascii for "+y+" is "+x);
            x++;
            y++;
        }

    }
}
