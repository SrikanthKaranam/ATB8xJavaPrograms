package sept.task.task_25092024;

import java.util.Scanner;
import java.util.SortedMap;

public class Vowels {
    public static void main(String[] args) {
        // Question 4 : Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

        String name = "Pramod" ;

        // Creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Enter the input String
        System.out.println("Enter the Input String");
        String s = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowels=vowels+1;
            }else {
                consonants=consonants+1;
            }
        }
        System.out.println("Total vowels count " + s + " = " + vowels);
        System.out.println("Total consonants count "+ s + " = " + consonants);
    }
}

// String : pramod
//Total vowels count pramod = 2
//Total consonants count pramod = 4