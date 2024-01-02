package Dec23;

public class Lab010 {
    public static void main(String[] args) {
        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        for (int i = 0; i >1 ; i++) {
            System.out.println("Hi");
        }
        System.out.println("End");
        //Since the initial value of i (0) is not greater than 1, the loop condition is never satisfied
        // at the beginning of the loop. Consequently, the loop body, which contains the statement System.out.println("Hi");, will not execute even once because the condition for the loop to continue (i > 1)
        // is not met from the start.


    }
}
//loop never gets executed
