package Practice_Strings;

public class Lab012 {

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,45,0};

        int min= arr[0];

        for(int i=0;i< arr.length;i++){

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
    }
}
