package oct.ex_23102024;

public class Lab000155 {
    public static void main(String[] args) {
        try {
            int b=0;
            String ip=args[0];
            int a=Integer.parseInt(ip);
            b=1000/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());//we can use
        }
//        catch (Object e) {
//            System.out.println(e.getMessage());//Can't use
//        }


    }
}
