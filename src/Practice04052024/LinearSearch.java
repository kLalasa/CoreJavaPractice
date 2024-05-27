package Practice04052024;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]= {23,50,45,69,70,80};

        boolean flag =false;

        int search_element=40;

        for(int i=0;i<a.length;i++) {
            if (search_element == a[i]){
                System.out.println("Element found at " +i);
                flag=true;
                break;
            }
            //System.out.println(a[i]);

        }

        if(flag==false){
            System.out.println("Element isnt found");
        }
    }
}
