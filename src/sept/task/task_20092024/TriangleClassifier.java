package sept.task.task_20092024;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Triangle Classifier ( If)
        //// Write a program that classifies a triangle based on its side lengths.
        //// Given three input values representing the lengths of the sides, determine
        //// if the triangle is equilateral (all sides are equal),
        //// isosceles (exactly two sides are equal), or
        //// scalene (no sides are equal).
        //// Use an if-else statement to classify the triangle.
        //// side1, side2, side3 ->

        int side1 = 2 ;
        int side2 = 2 ;
        int side3 = 3 ;

        if(side1==side2 && side2==side3 && side1==side3) {
            System.out.println("all sides are equal");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("isosceles");
        } else if (side1!=side2 || side2!=side3 || side1!=side3) {
            System.out.println("scalene");
        }

    }
}
