package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab000175_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList();
        mylist.add("Mansi");
       mylist.add("Sutar");
        mylist.add("Kore");
        System.out.println("_To Print Arraylist 1_");

        for (String str:mylist)
        {
            System.out.println(str);
        }

        System.out.println("_To Print Arraylist 2_");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }
        System.out.println("_To Print Arraylist 3_");
        //Iterator
        Iterator <String> iterator=mylist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
