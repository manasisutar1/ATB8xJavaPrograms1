package sept.ex_23092024;

public class Lab00094 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--");
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='Q')
            {
                break;
            }
            System.out.println(i);

        }

    }
}
