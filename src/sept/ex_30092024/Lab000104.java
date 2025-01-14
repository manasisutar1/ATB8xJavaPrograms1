package sept.ex_30092024;

public class Lab000104 {
    public static void main(String[] args) {

        function_type1();
        int age=function_type2();
        System.out.println(age);
        function_type3("Mannu",25);
        int result=function_type4(30,20);
        System.out.println(result);

    }
    static void function_type1()
    {
        System.out.println("1.Without parameter and without return type");
    }
    public static int function_type2()
    {
        System.out.println("Without parameter with return type");
        return 65;
    }
    //with parameters and without return type
    public static void function_type3(String name,int age)
    {
        System.out.println("3.With parameter and without return type");
        System.out.println("You have shared ->"+name);
        System.out.println("You have shared->"+age);
    }
    //With parameter and with return type
    static int function_type4(int a,int b)
    {
        System.out.println("4.With parameter and with return type");
        return a+b;
    }
}
