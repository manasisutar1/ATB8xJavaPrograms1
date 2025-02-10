package oct.ex_14102024.Abstaction.realex2;

public class Wagnor extends Engine{


    void drive(){
        startengine();
        stopengine();
    }
    @Override
    void startengine() {
        System.out.println("Starting car");
    }

    @Override
    void stopengine() {
        System.out.println("stopping car");
    }
}
