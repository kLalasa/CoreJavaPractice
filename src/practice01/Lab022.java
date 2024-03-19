package practice01;

public class Lab022 {
    public static void main(String[] args) {

        int count;
        for(int i=1;i<=5;i++){
            count=i+1;
            for(int j=1;j<=5;j++){
                System.out.print(count++ + " ");

            }
            System.out.println();
        }
    }
}
