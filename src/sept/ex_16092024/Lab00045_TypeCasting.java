package sept.ex_16092024;

public class Lab00045_TypeCasting {
    public static void main(String[] args) {
        //type casting
        //widening-Implicit,Explicit-lossless
        //narrowing-Implicit ,Explicit(with data type)loss

        //widening
        byte b =10;
        int a =b;
        int a1=(int)b;
        //narrowing
        int val=300;
//        byte b1=val;
        byte b2=(byte)val;
        System.out.println(b2);

    }
}
