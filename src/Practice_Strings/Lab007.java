package Practice_Strings;

import java.util.Arrays;

public class Lab007 {

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,1,2,3,4};

        findFreq(arr);

    }

    public static void  findFreq(int[] arr){


        Arrays.sort(arr);

        int n= arr.length;
        for(int i=0;i<n;i++){

            int count=1;
            while(i<n-1 && arr[i]==arr[i+1]){

                count++;
                i++;
            }

            System.out.println("elment:" +arr[i]+ "  Frequency: " +count);
        }



    }





}
