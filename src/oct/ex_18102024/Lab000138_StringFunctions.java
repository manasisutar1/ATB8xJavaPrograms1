package oct.ex_18102024;

import java.util.Locale;

public class Lab000138_StringFunctions {
    public static void main(String[] args) {
        String str ="Hello World";
    //Lengths of the string
        System.out.println("Lenghts: "+str.length());

        //Substring
        System.out.println("Substring: "+str.substring(0,10));
        //Trim(Trim will remove the spaces)
        System.out.println("Trimmed: '"+str.trim()+"'");
        //Convert to uppercase
        System.out.println("Uppercase:"+str.toUpperCase());
        //Convert to lower case
        System.out.println("Lowercase:"+str.toLowerCase());

        System.out.println(str.charAt(6));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("M"));
        System.out.println(str.isEmpty());


        String name=" Manasi";//i->I
        String name2="ManasI";//i->I
        System.out.println(name.compareTo(name2));
        //Compareto= It written 0 when both are same
        //Return Number=ASCII Value difference between the strings
        //i->I=>Lexicographically comparison
        System.out.println(name.strip());

    }
}
