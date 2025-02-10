package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab000172_arraylist {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("Bread");
        list.add("Milk");
        list.add("Butter");
        list.add("Paneer");
        list.add("Jam");
        list.add("Cheeze");
       // System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("2"));
        System.out.println(list.lastIndexOf("3"));
        //Arraylist can not be use for shopping
        System.out.println("______Default for loop-");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("____Using a for each loop");
        for (Object o: list)
        {
            System.out.println(o);
        }


    }
}
