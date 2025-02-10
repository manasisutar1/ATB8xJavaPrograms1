package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab000173_arraylist {
    public static void main(String[] args) {
        List mark =new ArrayList();
        mark.add(50);
        mark.add(70);
        mark.add(60);
        mark.add(90);
        System.out.println(mark);
        //sorting
        Collections.sort(mark);
        System.out.println(mark);
        Collections.sort(mark,Collections.reverseOrder());
        System.out.println(mark);
    }
}
