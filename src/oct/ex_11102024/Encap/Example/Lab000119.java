package oct.ex_11102024.Encap.Example;

public class Lab000119 {
    public static void main(String[] args) {
        ICICIBank manasi=new ICICIBank("Manasi",100);
        //manasi.setBalance(10000);

        boolean are_you_admin=true;
        ICICIBank admin=new ICICIBank("admin",1000);
       admin.setBalance(5000,true);
        System.out.println(admin.getName());



    }
}
