package sept.task.task_18092024;

public class Task2 {
    public static void main(String[] args) {
        // Question : int a = 10;
        //System.out.println(  --a + a --  + a-); System.out.println(a);

        int  a = 10;
        System.out.println(a);
        System.out.println(--a + a-- + a--);
        System.out.println(a);
    }
}

/*
        output is 26 and 7
        line 10 for exp --a = 9 decrement first
           exp a-- = 9 and then decrement a by 1 so a=8
           exp a-- = 8 and then decrement a by 1 so a= 7
           adding exp = 9+9+8 = 26
           and a=7
 */