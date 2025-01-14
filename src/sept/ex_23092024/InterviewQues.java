package sept.ex_23092024;

import java.util.Scanner;

public class InterviewQues {
    public static void main(String[] args) {
        //fizzbuzz problem
        //Write a program that print numbers from 1 to 100
        //however for multiples of 3 print "fizz"instead of the numbers
        //multiples of 5 print"Buzz" for numbers that are multiples of the both
        //3 and 5 print"FizzBuzz"

        //Logic->
        //Step 1-
        //input->n int n=100->scanner class
        //output->String->fizz,buzz,fizzbuzz

        //step 2
        //rough logic
        //for ->int i=1 to 1<=100(n)
        //i->multiple of 3>modules-i%3==0->fizz
        //i->multiple of 5->modules-i%5==0->buzz
        //i-> multiple of 3 and 5->modules->i%3 && i%5==0->fizzbuzz

        //step 3
        //real logic
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = 100 :- ");
        int n=sc.nextInt();

        for (int i = 1; i <=100 ; i++) {
            if(i % 3 ==0 && i % 5==0)
            {
                System.out.println("FizzBuzz");
            } else if (i % 5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }



    }
}
