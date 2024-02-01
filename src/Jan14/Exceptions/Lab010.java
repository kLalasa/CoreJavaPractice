package Jan14.Exceptions;

public class Lab010 {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person isnt eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        try{
        validate(13);
    }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
