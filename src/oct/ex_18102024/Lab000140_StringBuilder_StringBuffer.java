package oct.ex_18102024;

public class Lab000140_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//        String name="Pramod";
//        name="Aramod";
        //Final class of StringBuffer
        StringBuffer stringBuffer=new StringBuffer("Manasi");
        stringBuffer.append("Sutar");
        System.out.println(stringBuffer);

        //StringBuilder
        StringBuilder sb= new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);

    //Inserting into StringBuilder
        sb.insert(5,",");
        System.out.println(sb);

        //Deleting from StringBuilder
        sb.delete(5,6);
        System.out.println(sb);

        //Reversing StringBuilder
        sb.reverse();
        System.out.println(sb);


    }
}
