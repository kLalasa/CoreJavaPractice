package Practice04052024;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String str= "Welcome to Java Programming and Java OOPs";

        int total_length= str.length();
        int length_afterremoval= str.replaceAll("a","").length();

        int count= total_length - length_afterremoval;
        System.out.println("A character occurences  " +count);
    }
}

