package Dec23;

public class Lab019 {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){
            if(i%2==0){
                System.out.println("Value of i even "  +i);
                continue;
            }
            System.out.println("Val of i is odd"  +i);
        }
    }
}
