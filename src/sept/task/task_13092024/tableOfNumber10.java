package sept.task.task_13092024;

public class tableOfNumber10 {
    public static void main(String[] args) {
        // Write a program to print the table of number which user will give( int num 10)
        //output will be like this (by using the printf()
        //10 × 1 = 10
        //10 × 2 = 20
        //10 × 3 = 30….
        //10 × 10 = 100.

        int num = 10;

        System.out.println("printing the table of 10 number");
        //System.out.printf("printing the %d", = num , 1, num*1);
        System.out.printf("%d x %d = %d", num , 1, num*1);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 2, num*2);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 3, num*3);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 4, num*4);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 5, num*5);
        System.out.println();
        // Instead of println always we can use \n for next line ma using that for below one
        System.out.printf("%d x %d = %d\n", num , 6, num*6);
        System.out.printf("%d x %d = %d\n", num , 7, num*7);
        System.out.printf("%d x %d = %d\n", num , 8, num*8);
        System.out.printf("%d x %d = %d\n", num , 9, num*9);
        System.out.printf("%d x %d = %d\n", num , 10, num*10);

        // using for loop printing the 10th table
        System.out.println("using for loop printing the 10th table");
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }


    }
}
