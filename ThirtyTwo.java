import java.util.Scanner;
public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2="";
        int i;
        if(str.length()<3){
            for (i=0;i<3;i++){
                if (i<str.length()){
                    str2=str2+str;
                }
                else {
                    str2=str2+"#";
                }
            }
        }
        System.out.println(str2);
    }
}
