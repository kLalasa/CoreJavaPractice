package Practice_Strings;

import java.util.Arrays;
import java.util.Collections;

public class Lab014 {

    static void  secondLargest(Integer arr[], int size){
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        for(int i=1;i< arr.length;i++){

            if(arr[i]!=arr[0]){
                System.out.println("Second largest element:" +arr[i]);
                return;

            }
        }


    }


    public static void main(String[] args) {

      Integer arr[]={1,24,57,57,56,34,58,58};
        int size= arr.length;
        secondLargest(arr,size);
    }
}
