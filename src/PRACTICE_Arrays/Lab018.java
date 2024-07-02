package PRACTICE_Arrays;

import java.util.Arrays;

public class Lab018 {

    public static void check(int[] arr, int Check_value){

        boolean test= false;

        for(int ele:arr)
            if (ele==Check_value) {
                test = true;
                break;
            }

        System.out.println(Check_value+ " is found in the array");
    }


    public static void main(String[] args) {
        int arr[]={5,1,2,3,5,6,7};
        int Check_value=7;



        System.out.println("Array :" + Arrays.toString(arr));
        check(arr,Check_value);
    }
}
