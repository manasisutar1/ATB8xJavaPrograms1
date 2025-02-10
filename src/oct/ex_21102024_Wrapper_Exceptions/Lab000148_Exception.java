package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000148_Exception {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
        String ip=args[0];//10 //ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(ip);//10 //NumberFormatException
        int b=1000/a;//100
        System.out.println(b);//100
        System.out.println("End of the program");
    }
}
