package Practice04052024;

public class EvenOddNumArray {

    public static void main(String[] args) {
        int a[]={2,5,67,8,7,10};

        System.out.println("Printing even numbers in array");
        for(int i=0; i<=a.length-1;i++) {

            if (a[i] % 2 == 0) {

                System.out.println("  " + a[i]);
            }
        }
        System.out.println("Printing odd numbers");
            for(int i=0; i<=a.length-1;i++) {
                if (a[i] % 2 != 0) {

                    System.out.println(" " + a[i]);
                }
            }

//        System.out.println("Printing Even numbers");
//        for(int value:a){
//            if(value%2==0){
//                System.out.println(value);
//            }
//
//        }
//
//        System.out.println("Printing Odd numbers");
//        for(int value:a){
//            if(value%2!=0);
//            {
//                System.out.println(value);
//            }
//        }

        }
    }

