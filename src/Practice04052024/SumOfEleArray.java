package Practice04052024;

public class SumOfEleArray {
    public static void main(String[] args) {
        int a[]={3,7,89,45,67,65};

        int sum=0;

//        for(int i=0;i<=a.length-1;i++)
//        {
//            sum =sum+a[i];
//        }

        for(int value:a){
            sum =sum+value;
        }
        System.out.println(sum);
    }
}
