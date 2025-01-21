package oct.ex_09102024_Inheritance.Concept_HasA;

public class Car {
    //car has engine as well as tyer

        protected void Startcar()
        {
         new Engine().start();
         new Tyer().Rollling();
        }
}
