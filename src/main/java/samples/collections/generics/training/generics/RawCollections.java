package samples.collections.generics.training.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Денис on 16.11.2016.
 */
public class RawCollections {
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("123");
        list.add("aaa");
        //list.add(null);
        //list.add(5); //Integer.valueOf(5);

        for( Object item : list){
            System.out.println(item);
        }

        for( Object s: list ){
            System.out.println( ((String) s).length() );
        }
        System.out.println("=============================");
        List<?> fixedList = new ArrayList<>(Arrays.asList(1,2,3,4,5) );
        //fixedList.add("1111");

        //fixedList.add(22);
        System.out.println( fixedList.remove(3));
        System.out.println(fixedList.remove((Object)2));


        for( Object s: fixedList ){
            System.out.println( ((Integer) s).intValue() );
        }
    }

}
