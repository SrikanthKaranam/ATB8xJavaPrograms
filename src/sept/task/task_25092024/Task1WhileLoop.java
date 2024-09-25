package sept.task.task_25092024;

public class Task1WhileLoop {
    public static void main(String[] args) {
        // Question 1:  Table of number n = 10, print table with For or while.
       // out put required : 10 * 1 = 10

        // For Loop
        int n = 10;
        for (int i = 1; i <=10 ; i++) {
            int result = n * i ;
            System.out.println(n + "x" + i  + "= "  + result);
        }
        System.out.println("-----------------------------------");
        // while  Loop
        int i=1;
        while (i<=10){
            int table = n*i;
            System.out.println(n + "x" + i  + "= "  + table);
            i++;
        }
    }
}

// output
    /*  10x1= 10
        10x2= 20
        10x3= 30
        10x4= 40
        10x5= 50
        10x6= 60
        10x7= 70
        10x8= 80
        10x9= 90
        10x10= 100
        -----------------------------------
        10x1= 10
        10x2= 20
        10x3= 30
        10x4= 40
        10x5= 50
        10x6= 60
        10x7= 70
        10x8= 80
        10x9= 90
        10x10= 100  */