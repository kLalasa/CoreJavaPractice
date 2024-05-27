package Practice04052024;

public class MissingNumInArray {
    public static void main(String[] args) {

        int a[]={1,2,4,5};

        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of the elements in the Array " +sum1);

        for(int i=1;i<=5;i++){
            sum2= sum2+i;

        }
        System.out.println("sum of range elements in Array " +sum2);
        System.out.println("Missing number in Array " +(sum2-sum1));
    }
}
