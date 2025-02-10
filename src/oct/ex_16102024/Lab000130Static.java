package oct.ex_16102024;

public class Lab000130Static {
    public static void main(String[] args) {
        student s1=new student(23);
        student s2=new student(33);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(student.School_name);
        student.School_name="XYZ";
        System.out.println(student.School_name);
    }
}

class student {
    int age;//Instance variable-(non static)
    static String School_name="ABC";//Static variable



    {
        System.out.println("IIB");//Instance initialization Block
        System.out.println("Here you can write code what you want to do when object is created");
        System.out.println("Read a mySQL DB()");
    }
    static{
        System.out.println("SIB");//Staic initialization block
        System.out.println("Loaded once,When class is loaded");
    }


    public student(int age) {
        this.age = age;
    }
}
