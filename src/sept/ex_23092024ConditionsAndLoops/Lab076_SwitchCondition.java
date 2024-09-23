package sept.ex_23092024ConditionsAndLoops;

public class Lab076_SwitchCondition {
    public static void main(String[] args) {
        // Switch condition Without break, it will execute ALL Cases
        // Days - 1 to 7 ---> 1--Mon, 2--Tue, 3--Wed, ...etc
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No, idea what day it's");
        }
        System.out.println("End of the loop");
    }

}
