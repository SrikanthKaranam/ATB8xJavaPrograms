package sept.task.task_18092024;

public class Task3 {
    public static void main(String[] args) {
        // Question : int a = 10;
        //System.out.println(  --a + a++ + a—); System.out.println(a);

        int a = 10;

        System.out.println(a);
        System.out.println(--a + a++ + a--); // a = 9+10+9 =28
        System.out.println(a); // a= 9


      /*
                output is 28 and 9
                line 11 exp --a = 9
                exp a++ = 9 amd then increment a by 1 so a=10
                exp a-- = 10 and then decrement a by 1 so a = 9
                adding exp = 9+9+10 = 28
                and a=9
       */

    }


}
