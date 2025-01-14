package oct.ex_04102024_Constructors.PC;

public class Dog {

            String name;
            int age;
            int legs;
            String breed;

            Dog()
            {
                System.out.println("I am DC");
                System.out.println("God id happy!!!!!!");
            }

            Dog(String breed)
            {
                System.out.println("I am DC");
                this.breed=breed;
            }
            Dog(String breed,String name,int age,int legs)
            {
                System.out.println("I am DC");
                this.breed=breed;
                this.name=name;
                this.age=age;
                this.legs=legs;
            }
            void walk()
            {

            }
}
