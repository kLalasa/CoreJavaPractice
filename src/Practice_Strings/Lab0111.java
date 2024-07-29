package Practice_Strings;

public class Lab0111 {
    public static void main(String[] args) {
        int[] arr= new int[]{12,3,4,56,7,7};

        int max= arr[0];

        for(int i=0;i< arr.length;i++){

            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println(max);
    }
}
