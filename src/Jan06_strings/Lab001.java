package Jan06_strings;

public class Lab001 {
    public static void main(String[] args) {
        String str="Welcome";//String Constant pool
        String str1=new String("to Java");//Heap Area

        String str2= str.concat(str1);

        System.out.println(str2);




    }
}
