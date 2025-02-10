package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000144 {
    //Real reason why we using wrapper class
    public static void main(String[] args) {
        String num="10";
       // int a=num;//Non primitive data types to primitive data types conversion is not possible
        Integer a=Integer.valueOf(num);
        System.out.println(a);
        int a2=a;//unboxing

        //String to primitive
        int a3=Integer.parseInt(num);
        System.out.println(a3);

        //Integer->Collection framework->you can only use class and object


    }
}
