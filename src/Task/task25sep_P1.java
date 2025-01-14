package Task;

import java.util.Scanner;

public class task25sep_P1 {
    public static void main(String[] args) {
        //table of number n=10.print the table for or while
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers\n");
        int n=sc.nextInt();
        System.out.println("Mul of table");
        for (int i = 0; i <=10; i++) {
            System.out.println(n+ "x" +i+ "=" +(n*i));
        }
    }
}
