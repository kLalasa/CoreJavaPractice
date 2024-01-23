package Jan_07;

public class ATBperson {
    String name;
    long phone;
    String email;
    boolean isMarried;

    ATBperson(){
        System.out.println("I am DC");
        name="Lalasa";
    }

    void talk(){
        System.out.println("Talk");
    }
    void printDetails(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(isMarried);
    }
}
