package oct.ex_11102024.Encap;

public class Lab000118 {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("admin","password");
        System.out.println(vwoLogin.password);
        vwoLogin.password="hacker";
        System.out.println(vwoLogin.password);

       GoodVWOLogin vwoLogin1=new GoodVWOLogin("admin123","pass");
//        System.out.println(vwoLogin1.password);
        System.out.println(vwoLogin1.getPassword());

        //Checking Admin
        boolean isAdmin=false;
        vwoLogin1.setPassword("newpassword",isAdmin);
        System.out.println(vwoLogin1.getPassword());
    }
}
