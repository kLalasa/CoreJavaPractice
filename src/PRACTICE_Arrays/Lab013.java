package PRACTICE_Arrays;

public class Lab013 {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,4,5};

        int count= arr.length;
        int sum=0;
        float avg=0;

        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];

            avg=sum/count;




        }

        System.out.println("avg of the array elements" +avg);
    }
}
