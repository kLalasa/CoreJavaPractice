package Practice240424;

import java.util.Arrays;

public class Lab004 {
    public static void main(String[] args) {
        int[] arr=new int[]{12,56,34,45,67,78};
        for (int i=1;i<arr.length;i++)
            System.out.println(arr[i]);
        System.out.println(Arrays.toString(arr));
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }


        }
        System.out.println("sorted array in descending order");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        System.out.println(Arrays.toString(arr));

    }
}


