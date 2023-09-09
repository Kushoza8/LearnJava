// Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4.
// Also count how many three-digit numbers are there.
//three digit so 3 nested loops and range 1 to 4 inclusive
//if we were asked 4 digit combination then we would we have used 4 nested loops
public class Seventeen {
    public static void main(String[] args) {
        int i,j,k;
        int sum=0;
        for (i=1;i<=4;i++){
            for (j=1;j<=4;j++){
                for (k=1;k<=4;k++){
                    if (i !=j && j!=k && k!=i){
                        sum++;
                        System.out.println(i +""+j+""+k);
                    }
                }
            }
        }
        System.out.println("possible combinations: "+sum);
    }
}
