package sept.ex_20092024;

public class Lab00055 {

    public static void main(String[] args) {


        //Ternary operator
        //condition? expression_if_true : expression_if_false
        int a=10;
        int b=20;

        int max=(a>b)?a:b;
        int min=(a<b)?a:b;

        System.out.println(max);
        System.out.println(min);
    }
}
