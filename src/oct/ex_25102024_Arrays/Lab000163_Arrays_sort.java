package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab000163_Arrays_sort {
    public static void main(String[] args) {
        int [] marks={51,100,91,87,90};
        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[4]);
//
        Arrays.sort(marks);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("______________________");

        int item=Arrays.binarySearch(marks,100);
        System.out.println(item);
    }
}
