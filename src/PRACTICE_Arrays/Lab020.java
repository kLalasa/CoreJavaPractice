package PRACTICE_Arrays;

import java.util.Arrays;

public class Lab020 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,24,68,5,7,67,69};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,2,5);

        System.out.println("Modified Array " +Arrays.toString(arr));
    }
}
