//1) question from hackerrank 
//In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));  // Use add() for BigInteger addition
        System.out.println(a.multiply(b));  // Use multiply() for BigInteger multiplication
    }
}
Ensure that you have imported java.math.BigInteger for BigInteger to be recognized, and make sure your Java environment is properly configured.
