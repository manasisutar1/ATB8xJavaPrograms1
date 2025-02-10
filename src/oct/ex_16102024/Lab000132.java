package oct.ex_16102024;

public class Lab000132 {
    public static void main(String[] args) {
        ATB s1=new ATB("manasi");
        ATB s2=new ATB("Nikita");
        ATB s3=new ATB("Prerana");
        ATB s4=new ATB("Kriti");

        s1.readDocuments();
        s2.readDocuments();
        ATB.doAssignment();
    }

}
class ATB{


    {
        System.out.println("IIB");
        //What is the purpose
        //Here you can write code related to
        //Start a website or anything before starting the
        //web automation or api automation
        System.out.println("Reading from csv file");

    }
    static{
        System.out.println("Load the class?I will execute");
    }
    private String name;
    private  long number;
    static String coursename="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ATB(String name){
        this.name=name;
    }
    void readDocuments(){
        System.out.println("This is non static method");
        System.out.println(coursename);
    }
    static void doAssignment(){
       // System.out.println(phone);
        System.out.println("Do Assignment");
    }
    static class genAI{
        //0.1111 % in automation
    }
}
