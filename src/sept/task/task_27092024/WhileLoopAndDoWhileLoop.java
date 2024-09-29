package sept.task.task_27092024;

public class WhileLoopAndDoWhileLoop {
    public static void main(String[] args) {
        // Give me example of while vs do while loop in Lab ex.

       // Example for While loop  when condition is True
        System.out.println("-------Printing the While loop condition is True ---------");
        int count = 0;
        while (count<3){
            System.out.println("count is : "+ count);
            count++;
        }

       /* output =  count is : 0
                    count is : 1
                    count is : 2   */

        System.out.println("-------Printing the While loop when condition is false---------");

        // Example for While loop when condition is False
        int count1 = 5;
        while (count1<3){
            System.out.println("count is : "+ count1);
            count1++;
        }  // Output is ntg will print because count condition is false


        // Example for do While loop  when condition is True
        System.out.println("-------Printing the Do While loop condition is True ---------");
        int number = 0;
        do {
            System.out.println("Number is : " + number);
            number++;
        } while (number<3);


        // Example for do While loop  when condition is True
        System.out.println("-------Printing the Do While loop when condition is false---------");
        int number1 = 5;
        do {
            System.out.println("Number is : " + number1);
            number1++;
        } while (number1<3);
        // output : Number is : 5
    }
}
