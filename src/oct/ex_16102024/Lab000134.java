package oct.ex_16102024;

public class Lab000134 {

    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());
        System.out.println(color.BLUE.getHexcode());

        if(color.GREEN.getHexcode()=="#075b0e")
        {
            System.out.println("Color is green");
        }

    }

}
enum color{
    RED("#ff5733"),
    BLUE("#3633ff"),
    GREEN("#075b0e");



    private String hexcode;
    private color(String hexcode) {
        this.hexcode = hexcode;
    }
    public String getHexcode(){
        return this.hexcode;
    }
}
