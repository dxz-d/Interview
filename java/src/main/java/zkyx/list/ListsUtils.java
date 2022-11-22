package zkyx.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 */
public class ListsUtils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list1 = Arrays.asList("a","b","c");

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list.equals(list1));


    }
}
