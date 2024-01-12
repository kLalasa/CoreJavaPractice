package Jan06_strings;

public class Lab004 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello  ");
        sb1.append("world");
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder("New ");
        sb2.append("year");
        System.out.println(sb2);
//to overcome the limitations of strings immutability string buffer and stringbuilder are introduced

    }
}