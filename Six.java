public class Six {
    public static void main(String[] args) {
        char grade='B';
        //to encrypt
        grade=(char)(grade+8);
        //the 5th line is known as typecasting
        System.out.println(grade);
        //character+integer is always an integer
        //can be converted to char by typecasting
        //to decrypt
        grade=(char)(grade-8);
        System.out.println(grade);
    }

}
