package sept.task.task_18092024;

public class Task1 {
    public static void main(String[] args) {
        // Question 1: Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

        // Implicit widening from int to long
        int numInt = 100;
        long numLong = numInt; // No cast needed
        System.out.println("Int to Long: " + numLong);

        // Implicit widening from int to double
        double numDouble = numInt;
        System.out.println("Int to Double: " + numDouble);

        // Explicit narrowing from double to int
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manually cast double to int
        System.out.println("Double to Int: " + myInt); // Output will be 9, decimal part lost
    }
}
