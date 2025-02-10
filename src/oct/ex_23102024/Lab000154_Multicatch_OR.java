package oct.ex_23102024;

public class Lab000154_Multicatch_OR {
    public static void main(String[] args) {
        try {
            int b=0;
            String ip=args[0];
            int a=Integer.parseInt(ip);
            b=1000/a;
        } catch (ArithmeticException| ArrayIndexOutOfBoundsException| NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
