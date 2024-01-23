package Jan_07;

public class BankAccount {
    String Bankname;
    String Bankcode;

    BankAccount(){
        Bankname="SBI";
        Bankcode="SBI001";
        System.out.println("I am DC");
    }
    BankAccount(String Bname,String Bcode){
        Bankname=Bname;
        Bankcode=Bcode;

    }

    void printDetails(){
        System.out.println("Bank name is"  +Bankname);
        System.out.println("Bank code is" +Bankcode);
    }
}
