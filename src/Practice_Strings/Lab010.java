package Practice_Strings;

import java.util.Arrays;

public class Lab010 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int[] revarr=new int[arr.length];

        for(int i=0;i< arr.length;i++){

            revarr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(revarr));
    }
}
