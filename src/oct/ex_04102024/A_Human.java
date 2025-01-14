package oct.ex_04102024;

public class A_Human {
    public static void main(String[] args) {
        String eyes_color;
        String name;
        long adhaarcard_number;

    }

        A_Human(){

        System.out.println("I will be called when object is created");
        //write a code which are automatically called when object is created
            //Read a file
            //Read a csv file

        }
        //parameterized constructor
    A_Human(String name){
        System.out.println("HI, I am parametrized constructors");
    }

        void walk()
        {
            System.out.println("NRNA");
        }
        int talk()
        {
            System.out.println("RTNA");
            return 10;
        }
        String sleep(String name)
        {
            System.out.println("RTWA");
            System.out.println("Sleeping");
            return "I am sleeping";
        }

        void eat(String name)
        {
            System.out.println("NRWA");
            System.out.println("I am eating");

        }

    }

