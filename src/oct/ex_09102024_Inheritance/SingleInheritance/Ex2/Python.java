package oct.ex_09102024_Inheritance.SingleInheritance.Ex2;

public class Python extends Programming {
    //Python is a programming language
    Python()
    {
        System.out.println("Default Constructor");
    }
    void print()
    {
        System.out.println(Author);
        System.out.println(version);
    }
}
