//Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
//Test Data: Str1 = Python Str2 = Tutorial
//Sample Output:
//ythonutorial

import java.util.Scanner;
public class ThirtyOne {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        String str3="";
        String str4="";
        char[] strArr1=str1.toCharArray();
        char[] strArr2=str2.toCharArray();
        for (i=1;i<=str1.length()-1;i++){
            str3=str3 + strArr1[i];
        }
        for (j=1;j<=str2.length()-1;j++){
            str4=str4 + strArr2[j];
        }
        System.out.println(str3+str4);

    }
}
