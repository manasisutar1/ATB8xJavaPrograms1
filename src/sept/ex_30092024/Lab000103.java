package sept.ex_30092024;

public class Lab000103 {
    public static void main(String[] args) {
        //Without parameters and without return type
        //Without parameter but with return type
        //with parameters and without return type
        //with parameters and with retun type
        function_type1();
        String name=function_type2();
        System.out.println(name);
        function_type3("Manasi",25);
        int result=function_type4(3,4);
        System.out.println(result);

    }
        //1.Without parameter and without return type
        static void function_type1() {
            System.out.println("Without parameter and without return type");
        }

        //2.without parameters but with return type
        public static String function_type2() {
            System.out.println("Without parameter with return type");
            return "Manasi";
    }
        //3.With parameter and without return type
    public static void function_type3(String name,int age)
    {
        System.out.println("3.With parameter and without return type");
        System.out.println("You have shared->"+name);
        System.out.println("You have shared->"+age);

    }
    //With parameter and with return type
    static int function_type4(int a,int b)
    {
        System.out.println("4.With parameter and with return type");
        return a+b;
    }
}
