package PRACTICE_Arrays;

public class Lab003 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,8,20,11,4,17};

        int max=arr[0];
        for(int i=1;i<arr.length;i++){

            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println(max);
    }
}
