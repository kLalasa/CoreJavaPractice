package Jan_07;

public class BankMain {
    public static void main(String[] args) {
        BankAccount SBI = new BankAccount();
        SBI.printDetails();


        BankAccount Hdfc=new BankAccount("Hdfc","Hdfc002");

            Hdfc.printDetails();
        BankAccount Icici=new BankAccount("Icici","Icici003");
        Icici.printDetails();

    }
}
