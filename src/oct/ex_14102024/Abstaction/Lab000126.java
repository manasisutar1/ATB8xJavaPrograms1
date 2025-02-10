package oct.ex_14102024.Abstaction;



public class Lab000126 {

    public static void main(String[] args) {
        P p =new P();
        p.f1();
    }
}
class P implements I{

    @Override
    public void f1() {
        System.out.println("P");
    }
}
interface I{
    void f1();
}