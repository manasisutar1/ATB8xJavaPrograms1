package oct.ex_21102024_Wrapper_Exceptions;

import java.io.FileInputStream;

public class Lab000150_Exception {
    public static void main(String[] args) {
        //Checked ->JVM knows
       // FileInputStream file=new FileInputStream("C://a.txt");
        //JVM knows this that file may not exist

        //Unchecked Exception->Arithmetic Exception
        int a=10;
        int c=a/0;
        System.out.println(c);//Java.lang Arithmetic Exception->Terminated
        System.out.println("End");
    }
}
