package Dec24Arrays;

public class Lab001 {
    public static void main(String[] args) {
        //Arrays are collection of similar data type
        int[] marks_10={46,67,89,23,89};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
       // System.out.println(marks_10[6]);//it will throw exception

        int[] a=new int[4];
       //a--->[0,0,0,0]---default value of int-->0
        System.out.println(a[0]);
        System.out.println(a[1]);
        a[0]=45;
        System.out.println(a[0]);
        final int[] b=new int[4]; //length of the array we cant change, values we can change
        //b-->0,0,0,0
        b[0]=78;
        System.out.println(b[0]);
    }
}
