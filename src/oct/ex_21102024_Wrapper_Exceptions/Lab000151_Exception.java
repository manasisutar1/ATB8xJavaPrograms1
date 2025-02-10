package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000151_Exception {
    public static void main(String[] args) {
        //Unchecked Exception->java.lang.NullPointerException
        //JVM->at the runtime->terminated the program
        System.out.println("Start");
        String s1=null;
        System.out.println(s1.trim());
        System.out.println("End");
    }
}
