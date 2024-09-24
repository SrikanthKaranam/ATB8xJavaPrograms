package sept.task.task_18092024;

public class Task4 {
    public static void main(String[] args) {
        // Question 3: int a = 10;
        //System.out.println(  a- - + a --  + a --); System.out.println(a);

        int a =10;
        System.out.println( a-- +a-- + a--);
        System.out.println(a);

   /*   output is 28 and 9
        line 9 exp a-- = 10 then decrement by 1 so a=9
        exp a-- = 9 and then decrement a by 1 so a=8
        exp a-- = 8 and then decrement a by 1 so a =7
        adding exp = 10+9+8 = 26
        and a=7 */
    }
}
