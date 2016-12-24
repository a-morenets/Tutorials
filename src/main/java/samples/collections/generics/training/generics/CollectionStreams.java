package samples.collections.generics.training.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Денис on 16.11.2016.
 */
public class CollectionStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a" , "bb" , "ccc" , "dddd");

        //list.stream().forEach((s) -> System.out.println(s));
        //list.stream().forEach(System.out::println);

//        list.stream()
//                .filter( (s)->s.length()>2)
//                .forEach(System.out::println);
        System.out.println(
                list.stream()
                        .map(String::length)
                        .reduce( 0 , (x,y)->x+y ));

    }
}
