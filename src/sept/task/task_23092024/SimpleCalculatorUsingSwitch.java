package sept.task.task_23092024;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take first number input from the user
        System.out.print("Enter first number (num1): ");
        double num1 = scanner.nextDouble();

        // Take second number input from the user
        System.out.print("Enter second number (num2): ");
        double num2 = scanner.nextDouble();

        // Take operator input from the user (+, -, *, /, %)
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform operation based on the operator using switch
        switch (operator){
            case '+' :
                result = num1+num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-' :
                result = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*' :
                result = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/' :
                if (num2 !=0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%' :
                if (num2 !=0) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, /, or %.");
                break;
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
