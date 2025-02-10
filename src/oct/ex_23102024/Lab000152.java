package oct.ex_23102024;

public class Lab000152 {
    public static void main(String[] args) {
        int a=0;
        try {
            int c=10/a;//Arithmetic exceptions
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new ArithmeticException();
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
