package src.Basics;

public class Lab0024 {
    public static void main(String[] args) {

        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        int a2= true ? 10:20;
        System.out.println((a2));

        int a1 = (30>40) ? 10: 20;
        System.out.println((a1));

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);

        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);

        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

        int x= 40;
        int y = 20;
        int z = 32;
        int max1 = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println(max1);





    }
}
