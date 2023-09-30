package Generics;
interface Str_Demo{
    public void reverse(String str);
}
public class String_Demo {
    public static void main(String[] args) {
        Str_Demo str1=new Str_Demo() {
            int i;
            @Override
            public void reverse(String str) {
                char[] charArr=str.toCharArray();
                System.out.println("The reversed string is therefore");
                for (i=str.length()-1;i>=0;i--){
                    System.out.print(charArr[i]+"");
                }
                System.out.println();
            }
        };
        str1.reverse("Kush");
        str1.reverse("Jayesh");
    }
}
