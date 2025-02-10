package oct.ex_21102024_Wrapper_Exceptions;

public class Lab000143 {
    public static void main(String[] args) {
        //Primitive to wrapper class
        int a=10;
        Integer b=a;//Boxing->int->Integer
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a1=20;
        int value=a1;//Unboxing->Integer->int
        System.out.println(value);
    }
}
