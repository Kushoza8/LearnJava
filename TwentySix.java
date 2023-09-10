import java.util.Scanner;
public class TwentySix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Prime numbers from" + " 1 to 100:");
        int range= sc.nextInt();
        int i,j;
        for (j=2;j<=range;j++){
            int count=0; //after i loop to check for 1 number counter gets reintialized to zero that's why we put it after j loop
            for (i=2;i<=j/2;i++){
                if (j%i==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(j);
            }
        }
    }
}
