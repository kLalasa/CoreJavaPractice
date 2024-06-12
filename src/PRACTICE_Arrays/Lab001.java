package PRACTICE_Arrays;

public class Lab001 {

    public static void main(String[] args) {
         int[] arr=new int[]{2,7,8,3,5};

         int temp=0;

        System.out.println("Elements of Original Array");

        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+ " ");

        for(int i=0; i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array");

        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+ "  ");

    }
}
