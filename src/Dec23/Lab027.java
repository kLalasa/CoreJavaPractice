package Dec23;

public class Lab027 {
    public static void main(String[] args) {
       /* int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<1);*/
        //O/P--->1 though condition isnt satisfied, atleast once i gets printed
        int i=1;
        while(i<1){
            i++;
            System.out.println(i);
        }
        //O/P--> nothing because only condition satisfed thn loop gets executed
    }
}
