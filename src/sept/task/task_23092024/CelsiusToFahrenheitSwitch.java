package sept.task.task_23092024;

import java.util.Scanner;

public class CelsiusToFahrenheitSwitch {
    public static void main(String[] args) {
        // Question : Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c

        // 1km = 0.62137 miles
        // 1 Celsius = C = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9. F= (C*9/5)+32

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Please select the which conversion Required
        System.out.print("Select the Celsius Value = 1\nSelect the kilometers Value = 2 ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the values to convert Celsius to Fahrenheit");
                double f = scanner.nextDouble();

                // Celsius to Fahrenheit formula (c) = num * (9 / 5) + 32;
                double celsius = ((f * 9) / 5) + 32;
                System.out.println("Printing the Fahrenheit value : " + celsius);
                break;

            case 2:
                System.out.println("Please enter the values to convert Kilometer to Miles");
                double km = scanner.nextDouble();

                // Kilometer  to Miles formula (1Km) = 0.621371 miles
                double miles = km * 0.621371;
                System.out.println("Printing the Miles value : " + miles);
                break;
            default:
                System.out.println("please enter the valid choice");
            }

        // close the scanner
        scanner.close();
    }

}
