package oct.ex_23102024;

public class Lab000153_Exception_Multicatch {
    public static void main(String[] args) {
        try {
            String ip=args[0];//ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(ip);//NumberformatException
            int b=100/a;//Arithmetic Exception
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End");
        }
    }
}
