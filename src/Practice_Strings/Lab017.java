package Practice_Strings;

public class Lab017 {

    public static void main(String[] args) {
        String Original_string= "This    string     has many white spaces.   ";

        String nospaceString=Original_string.replaceAll("\\s+","");

        System.out.println(nospaceString);
    }
}
