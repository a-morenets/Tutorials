package samples.collections.generics.denis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Денис on 14.04.2016.
 */

class RoomSquareComparator implements Comparator<Room>{

    @Override
    public int compare(Room o1, Room o2) {
        return (int)Math.signum( o1.square - o2.square );
    }
}

public class RoomMain {


    public static void main(String[] args) {
        List<Room> list = new ArrayList<>();
        list.add( new Room("1" , 5 , 20. , true) );
        list.add( new Room("2" , 15 , 30. , true) );
        list.add( new Room ("Stanford" , 20 , 40. ,false));
        list.add( new Room("6" , 3 , 26. , true));
        //list.sort(null);
        Collections.sort(list);
        System.out.println(list);
        list.sort(new RoomSquareComparator());
        System.out.println(list);
        list.sort(new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                return o1.number.compareTo(o2.number);
            }
        });
        System.out.println(list);
        list.sort( (o1,o2)-> o1.number.compareTo(o2.number) );
        list.sort((o1,o2)-> o1.wiFi == o2.wiFi ? 0 :
                            o1.wiFi  ? 1 : -1   );
        System.out.println(list);

    }
}
