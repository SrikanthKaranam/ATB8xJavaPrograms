package sept.task.task_27092024;

public class PrintFirst5EvenNumbers {
    public static void main(String[] args) {

        // Question: Create a Java program that prints the first 5 even numbers using a do-while loop.

        int number = 2; // Starting number, first even number is 2
        int count = 0; // Counter to track how many even numbers have been printed
        do {
            System.out.print(number + ", ");  // Print the current even number
            number = number+2; // Move to the next even number
            count++;  // Increment the counter
        } while (count<5); // Continue until 5 even numbers are printed
    }
}

// output:    2, 4 , 6 , 8 , 10
