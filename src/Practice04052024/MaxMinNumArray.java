package Practice04052024;

public class MaxMinNumArray {
    public static void main(String[] args) {

            int a[] = {34, 56, 67, 28, 89};
            int max = a[0];

            for (int i = 1; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }

            System.out.println("Maximum number: " + max);

            int min=a[0];
            for(int i=1;i<a.length;i++){
                if(a[i]<min)
                {
                    min=a[i];
                }
            }

        System.out.println(+min);
        }
    }