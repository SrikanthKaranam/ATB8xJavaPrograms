package sept.task.task_27092024;

import java.util.Scanner;

public class SumOf1To100 {
    public static void main(String[] args) {
        // Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Enter the Required up to that number for SUM.
        System.out.println("Enter the Number value (num)");
        int num = scanner.nextInt();

        int sum = 0 ;
        int number = 1;
        while (number <= num){
            //sum += number;
            sum = sum+number;
            number++;
        }
        System.out.println("The sum of numbers from 1 to 100 is "+ sum);
    }
}


// Output is The sum of numbers from 1 to 100 is 5050
