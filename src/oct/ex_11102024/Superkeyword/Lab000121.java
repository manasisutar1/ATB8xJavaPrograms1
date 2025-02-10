package oct.ex_11102024.Superkeyword;

public class Lab000121 {

    //Super keyword in java is a reference variable that allows
    //a sub class(Child class to reference the parent class)

    //Use of super with methods
    //Use of super with variables
    //Use of super with constructors

    public static void main(String[] args) {
        car c=new car();
    }

}

class car extends vehicle{
    public int maxspeed=281;

   void display(){
       System.out.println("Child");
   }
    car()
    {
       super(10);//constuctor chaining
        System.out.println("DC Car");
        System.out.println(this.maxspeed);
       this.display();//my own display
       super.display();//Parent display
        System.out.println(super.maxspeed);
    }


}


class vehicle{
    public int maxspeed=180;
    void display(){
        System.out.println("Parent");
    }

    vehicle()
    {
        System.out.println("DC vehicle");
    }
    vehicle(int a)
    {
        System.out.println("PC vehicle");
    }
    void message()
    {
        System.out.println("Hellooo vehicle");
    }
    void message(int a)
    {
        System.out.println("Hello vehicle");
    }

}
