package sept.ex_30092024;

public class Lab000105 {
    public static void main(String[] args) {

        function_type1();
        String name=function_type2();
        System.out.println(name);
        function_type3("Manasi",25);
        int result=function_type4(15,15);
        System.out.println(result);


    }

    static void function_type1()
    {
        System.out.println("1.Without parameter and without return type");
    }
    public static String function_type2()
    {
        System.out.println("2.Without parameter with return type");
        return "Manasi";
    }
    public static void function_type3(String name,int age)
    {
        System.out.println("3.With parameter and without return type");
        System.out.println("You have shared name->"+name);
        System.out.println("You have shared age->"+age);
    }
    static int function_type4(int a,int b)
    {
        System.out.println("4.With parameter and with return type");
        return a+b;
    }
}
