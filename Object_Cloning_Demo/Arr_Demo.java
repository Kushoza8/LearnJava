package Object_Cloning_Demo;

import java.util.Arrays;

public class Arr_Demo implements Cloneable{
    int[] arr;
    public Arr_Demo(){
        this.arr=new int[]{1,2,3,4,5,6};
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Arr_Demo arrDemo=new Arr_Demo();
        System.out.println(Arrays.toString(arrDemo.arr));
        //we will see the shallow copy first
        Arr_Demo arrDemo1=(Arr_Demo) arrDemo.clone();
        arrDemo.arr[0]=12;
        System.out.println(Arrays.toString(arrDemo1.arr)); //when we change value of array changes are
        //visible and thus it is a shallow copy
        //we want to make a deep copy
    }
}
