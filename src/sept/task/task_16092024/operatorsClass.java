package sept.task.task_16092024;

public class operatorsClass {
    public static void main(String[] args) {
        // Questions below
    /*  1) Difference between = and  ==?
        2) byte b = 10; long l = 10l; → How much Byte will be used.
        3) Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.
        4) short s = 10;
            char c = 'A'; //65
            int ss = s+c;
            System.out.println(ss);  */

// 1) Difference between = and  ==?
// 1) Answer
        /*   = operator:
               Assignment operator: Used to assign a value to a variable.
               Syntax: variable = value;
               Example: int x = 5; // Assigns the value 5 to the variable x  */

        int a = 10; // Assigns 10 to a
        int b = 10; // Assigns 10 to b

        /*    == operator:
                Comparison operator: Used to compare two values for equality.
                Syntax: expression1 == expression2
                Returns: true if the values are equal, false otherwise.
                Example: if (x == 5) { // Checks if x is equal to 5 }   */

        if (a == b) { // Compares a and b for equality
            System.out.println("a and b are equal.");
        } else {
            System.out.println("a and b are not equal.");
        }

       /* Key differences:
        1) Purpose: = assigns, == compares.
        2) Return type: = doesn't return a value, == returns a boolean.
        3) Usage: = is used in variable declarations and assignments, == is used in conditional statements and expressions.*/

// 2) byte b = 10; long l = 10l; → How much Byte will be used.
// 2) Answer
        byte b1 =10;
        long l = 10l;

        // it will be occupied for (1 byte + 8 bytes = 9 bytes )

       /* byte b = 10;: This line declares a byte variable b and assigns the value 10 to it. A byte data type occupies 1 byte of memory.
          long l = 10l;: This line declares a long variable l and assigns the value 10 to it. A long data type occupies 8 bytes of memory.
          Therefore, the total memory usage is 1 byte (for b) + 8 bytes (for l) = 9 bytes.   */

// 3) Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.
// 3) Answer
    // In Java, when you add two byte values, the result is automatically promoted to an int data type.
    byte b2 = 10 ;
    byte c2 = 10 ;
        int result = b2 + c2;
        System.out.println(result);

// 4) short s = 10; char c = 'A'; // the Unicode of A is 65 , int ss = s+c; System.out.println(ss);
// 4) Answer
        int s = 10 ;
        char c = 'A'; // the Unicode of A is 65
        int ss = s+c;
        System.out.println(ss);

    }
}
