package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000149_Exception {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
        String ip=args[0];
        int a=Integer.parseInt(ip);
        int b=1000/a;//ArithmeticException
        System.out.println(b);//100
        System.out.println("End of the program");
    }
}
