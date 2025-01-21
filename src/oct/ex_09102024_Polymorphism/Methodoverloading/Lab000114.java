package oct.ex_09102024_Polymorphism.Methodoverloading;

public class Lab000114 {
    public static void main(String[] args) {
        Mathoperations m=new Mathoperations();
        int result=m.add(3,4);
        System.out.println(result);
        String name= m.add("Manasi","Sutar");
        System.out.println(name);

    }
}
