package sept.ex_23092024;

public class Lab00093 {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {
            if (i%2 == 0) {
                System.out.println("Even number"+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
