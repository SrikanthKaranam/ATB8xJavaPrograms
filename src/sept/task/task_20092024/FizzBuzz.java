package sept.task.task_20092024;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // write a program for FizzBuzz
        
        // Create Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Enter the Number
        System.out.println("Enter the Number N = 100");
        int number = scanner.nextInt();

        for (int i =1; i<=number; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
        }
    }
}
