package Practice04052024;

import java.util.Arrays;

public class BuubbleSort {

    public static void main(String[] args) {
        int a[]= {20,67,36,46,89,16};

        System.out.println("Array before sorting" +Arrays.toString(a));

        int n= a.length;
        System.out.println(n);

        for(int i=0; i<n-1;i++){

            for(int j=0; j<n-1;j++){
                if(a[j]>a[j+1]){

                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Array after sorting" +Arrays.toString(a));
    }
}
