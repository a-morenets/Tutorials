package samples.collections.generics.denis;

import java.util.*;

/**
 * Created by Денис on 14.04.2016.
 */
public class CollectionsSamples {
    public static void main(String[] args) {
        String input = "as as sa fr ew wed ewdwe ewdwe dwe dwe"
                + " wde dew wed de gfte dwe wed wedw dwe wde dwe dwe"
                +" dwe dew dwe dwe dwe gt wed wde  dwe  32 23 23 543 23";

        String [] words = input.split("\\s+");
        System.out.println(Arrays.toString(words));
        List<String> list = new LinkedList<>( Arrays.asList( words ) );
        System.out.println(list);
        while ( list.remove ("as") );
        System.out.println(list);
        list.remove(3);
        System.out.println( list.indexOf("dwe") );
//        It is bad need ArrayList
//        for(int i = 0; i< list.size() ; i++ ){
//            if( "dwe".equals(  list.get(i) ) ){
//                System.out.println(i);
//            }
//        }
        Iterator<String> it = list.iterator();
        int i = 0;
        while(it.hasNext()){
            String val = it.next();
            i++;
            if( "dwe".equals(  val ) ){
                System.out.println(i);
            }
        }

        System.out.println("===============");
        i = 0;
        for( String val : list){
            i++;
            if( "dwe".equals(  val ) ){
                System.out.println(i);
            }
        }
        String secondStr = " 12 123 43  32 dw dwe dsf ewfd qw d2e qew qw qw re";
        Set<String> stringSet = new TreeSet<>( list );
        System.out.println(stringSet);
        Set<String> secondSet = new TreeSet<>(
                Arrays.asList( secondStr.split("\\s+") ) ) ;

        //elements in two sets
        System.out.println("repeats");
        for( String s: stringSet ){
            if( !secondSet.contains(s) ){
                System.out.println(s);
            }
        }
        //Map.Entry
        Map<String , Integer> map = new HashMap<>();
        for( String  s : list){
            Integer val;
            if( (val = map.get(s)) == null ){
                map.put( s , 1 );
            }else{
                map.put( s, val +1);
            }
        }
        //TreeMap<Integer, List<Integer>>
        System.out.println(map);

    }
}
