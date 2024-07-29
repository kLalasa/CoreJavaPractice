package Practice_Strings;

import java.util.Arrays;
import java.util.Collections;

public class Lab015 {
    public static void main(String[] args) {
        int arr[]= {25,63,0,0,89,1,1,23,45,56,89};

       Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int smallest=arr[0];

        for(int i=1;i< arr.length;i++){

            if(arr[i]!=smallest){
                System.out.println("SEcond largest element  " +arr[i]);
                return;

            }
        }
    }
}
