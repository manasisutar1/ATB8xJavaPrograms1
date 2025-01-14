package Task;

import java.util.Scanner;

public class task20sep {
    public static void main(String[] args) {
        //triangle classifier
//        Write a program that classifies a triangle based on its side lengths
//                given three input values representing the lengths of the sides
//                determine if the triangle is equileteral(all sides are equal)
//        isosceles(extractly two sides are equal)
//        scalene(no sides are equal)
//        use an if else statement to classify the triangle
        //side1,side2,side3

        //Step 1
        //sides ->double
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1:- ");
        double side1=sc.nextDouble();

        System.out.print("Enter the length of side 2:- ");
        double side2=sc.nextDouble();

        System.out.print("Enter the length of side 3:- ");
        double side3=sc.nextDouble();

        if(side1>=1 && side2>=1 && side3>=1)
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equal");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("isosceles");
            } else {
                System.out.println("scalene");
            }else{
            System.out.println("Are you mad? Negative sides");
        }

        //Always talk to your interview give them extra
        //edge you need to give them and if you can handle them
        //Test validation->special

    }
}
