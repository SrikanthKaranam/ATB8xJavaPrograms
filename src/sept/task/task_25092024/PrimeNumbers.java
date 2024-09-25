package sept.task.task_25092024;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Question 3: Prime Number from 1 to 100. (for loop)
        // A prime number is a number that can only be divided by itself and 1 without remainders.

        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}


// output Prime numbers from 1 to 100 are :
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97