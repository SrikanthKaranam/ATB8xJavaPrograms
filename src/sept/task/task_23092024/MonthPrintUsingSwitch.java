package sept.task.task_23092024;

import java.util.Scanner;

public class MonthPrintUsingSwitch {

    public static void main(String[] args) {
        // Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Enter the Integer input (1-12)
        System.out.print("Enter the Integer values in between 1-12 (num) :  ");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
           case 10 :
               System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Please Enter the Valid Number in between 1-12 only");
        }

    // Closing the scanner
        scanner.close();

    }
}
