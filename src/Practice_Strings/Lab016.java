package Practice_Strings;

public class Lab016 {

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,34,56,77,8,47};

        int even_count=0;
        int ood_count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                System.out.println(arr[i]+"  is an even number");
                even_count++;

            }
            else {
                System.out.println(arr[i]+ "  is an odd number");
                ood_count++;

            }
        }
        System.out.println("Number even numbers " +even_count);
        System.out.println("Number of Odd numbers " +ood_count);
    }
}
