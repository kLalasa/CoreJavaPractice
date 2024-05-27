package Practice04052024;

public class DuplicatesInArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,4,4};

        boolean  fLAG=false;

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

               if( arr[i]==arr[j]) {
                   System.out.println("duplicate element " + arr[i]);
                   fLAG = true;
               }
            }
        }
        if(fLAG==false)
            System.out.println("Duplicate element not found");
    }
}
