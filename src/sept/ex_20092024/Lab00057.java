package sept.ex_20092024;

public class Lab00057 {

    public static void main(String[] args) {
        //Ternary operators to handle multiple conditions
        //condition? expression_if_true : expression_if_false

        int score=98;
        String Grade_A=(score>=90)?"Grade A":"Grade B";
        String Grade_B=(score>=80)?"Grade B":"Grade C";
        String Grade_c=(score>=70)?"Grade C":"Grade D";
        System.out.println(Grade_A);
        System.out.println(Grade_B);
        System.out.println(Grade_c);



    }
}
