package oct.ex_23102024;

public class Lab000159_custom_Exception {
    public static void main(String[] args) throws Exception {
        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",200);
        Bank jp_Chase=new Bank("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_Chase));


    }
}
