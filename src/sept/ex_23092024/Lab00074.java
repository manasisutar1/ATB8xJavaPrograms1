package sept.ex_23092024;

public class Lab00074 {
    public static void main(String[] args) {
        int itemcode =002;
        switch (itemcode){
            case 001,002-> System.out.println("It is laptop");
            case 004-> System.out.println("It is desktop");
            case 005,006-> System.out.println("It is a mobile phone");
            default -> System.out.println("Hello");
        }
    }
}
