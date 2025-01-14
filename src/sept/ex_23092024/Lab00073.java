package sept.ex_23092024;

public class Lab00073 {
    public static void main(String[] args) {
        //JDK 13
        int itemcode=002;
        switch (itemcode){
            case 002,003,005:
                System.out.println("All of the them are electronic Gadget");
                break;
            case 001,004,006:
                System.out.println("This is mechanical engg");
                break;
            default:
                System.out.println("");
        }

    }
}
