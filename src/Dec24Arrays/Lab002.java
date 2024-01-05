package Dec24Arrays;

public class Lab002 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(arr1==arr2);

        int[] arr3=arr1;
        System.out.println(arr1==arr3);//true
        System.out.println(arr1.equals(arr2));
        //if string -true because it compares values
        //in case of arrays it compares the references,hence false

        arr3[0]=67;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
    }
}
