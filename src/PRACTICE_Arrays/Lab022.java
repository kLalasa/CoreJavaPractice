package PRACTICE_Arrays;

import java.util.Arrays;

public class Lab022 {

    public static void main(String[] args) {
        int[] arr= new int[]{1,6,53,5,5,7,1,6};

        Arrays.sort(arr);

        int j=0;

        int[] temp = new int[arr.length];

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]!=arr[i+1]){

                temp[j]=arr[i];
                j++;


            }
        }

        temp[j]=arr[arr.length-1];

        for(int i=0;i<temp.length;i++)
            System.out.print(temp[i]+ " ");

    }
}
