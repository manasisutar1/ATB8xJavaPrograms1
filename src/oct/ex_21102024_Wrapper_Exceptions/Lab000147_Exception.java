package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000147_Exception {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
        String ip=args[0];//10
        int a=Integer.parseInt(ip);//10
        int b=1000/a;//100
        System.out.println(b);//100
        System.out.println("End of the program");

        //JVM will be initialize(From RAM)
        //Created and starts the main thread->main called
        //1.Colllect the CLI Arguments->10
        //String[]args={10}
        //2.Lab000147_Exception.main()
        //Now control will be transferred from main thread to main method

        //When any problem comes->JVM will handle it
        //If you dont handle the exception->JVM will handle it
        //How JVM handle->JAM Always terminate the program

    }
}
