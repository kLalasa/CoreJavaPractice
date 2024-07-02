package PRACTICE_Arrays;

import java.util.Arrays;

public class Lab023 {

    public  static int RemoveDuplicates(int arr[]){

        Arrays.sort(arr);

        int rd=0;
        for(int i=1;i<arr.length;i++){
         if(arr[rd]!=arr[i]){
             rd++;
             arr[rd]=arr[i];
         }

        }
        return rd+1;


    }


    public static void main(String[] args) {
        int[] arr={2,3,4,5,4,5,6,6};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ "");



      int rd=RemoveDuplicates(arr);
        System.out.println();

    for(int i=0;i<rd; i++){
        System.out.print(arr[i]+ "");
    }


}

}
