package sept.ex_23092024;

import java.util.Scanner;

public class Lab00098 {
    public static void main(String[] args) {
        //How to take a user input

        Scanner sc=new Scanner(System.in);//new object
        System.out.println("Enter the number :- ");
        int num=sc.nextInt();
        System.out.println(num);

        String name=sc.next();
        System.out.println(name);
    }
}
