package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab000176_Vector {
    public static void main(String[] args) {
        List l=new ArrayList(5);
        l.add("Manasi");
        l.add("Sutar");
        l.add("Manasi");
        l.add("Kore");
        l.add("Kiran");
        System.out.println(l);

        Vector v=new Vector();
        v.add("Manasi");
        v.add("Sutar");
        v.add("Anusha");
        System.out.println(v);

        //Only problem with the vector
        //Thread safe-Synchronized
        //It will be time consuming
        //one by one
        //slower
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.contains("1"));
        System.out.println(v.indexOf("2"));
        System.out.println(v.lastIndexOf("3"));

    }
}
