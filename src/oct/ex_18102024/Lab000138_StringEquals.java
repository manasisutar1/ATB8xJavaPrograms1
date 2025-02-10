package oct.ex_18102024;

public class Lab000138_StringEquals {
    public static void main(String[] args) {
        String s1="Hello";//SCP(String Constants Pool)
        String s4="Hello";//SCP
        String s2=new String("Hello");//object area
        String s3=new String("Hello");//Object area
        String s5=new String("hello");

//        System.out.println(s1==s2);//false
//        System.out.println(s2==s3);
//        System.out.println(s1==s4);
        //== is basically checking the reference locations

        //How can I check the value?
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));


    }

}
