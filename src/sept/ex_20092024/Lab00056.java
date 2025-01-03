package sept.ex_20092024;

public class Lab00056 {
    public static void main(String[] args) {
        //Ternary operators to handle multiple conditions

        int A =90;
        int B=80;
        int C=70;

        String Grade_A=(A>B)?"Grade A": "Grade B";
        System.out.println(Grade_A);

        String Grade_B=(A<B)? "Grade A ": "Grade B";
        System.out.println(Grade_B);



        String Grade_C=(B<C)? "Grade B":"Grade C";
        System.out.println(Grade_C);


    }
}
