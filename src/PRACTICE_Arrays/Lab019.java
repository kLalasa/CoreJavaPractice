package PRACTICE_Arrays;

import java.util.Arrays;

public class Lab019 {

    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,44,5};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        for(int a: arr)
            System.out.print(a+ " ");

    }
}
