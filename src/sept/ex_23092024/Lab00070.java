package sept.ex_23092024;

public class Lab00070 {

    public static void main(String[] args) {

            String browser="firefox";

            switch(browser)
            {
                case "chrome":
                    System.out.println("Starting the chrome browser");
                    break;
                case "firefox":
                    System.out.println("Starting the firefox browser");
                    break;
                case "edge":
                    System.out.println("Starting the edge");
                    break;
                default:
                    System.out.println("I have not idea which browser is this");


            }
    }
}
