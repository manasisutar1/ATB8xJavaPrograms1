package oct.ex_09102024_Polymorphism.Methodoverriding.real;

public class Lab000116 {
    public static void main(String[] args) {
        Manasi m=new Manasi();
        m.home();

        Father f=new Father();
        f.home();

        //Dynamic dispatch
        Father object=new Manasi();
        object.home();
    }
}
