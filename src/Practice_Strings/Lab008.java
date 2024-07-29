package Practice_Strings;

public class Lab008 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1,6,6,7,8,9,9};

        System.out.println("Duplicate elements in the array");

        for(int i=0;i< arr.length;i++){

            for(int j=i+1;j< arr.length;j++){

                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
