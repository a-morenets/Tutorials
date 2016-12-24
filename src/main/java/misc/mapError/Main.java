package misc.mapError;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MORA on 11.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Map<KeyObject, String> map = new HashMap<>();

        KeyObject keyObject = new KeyObject(31);
        map.put(keyObject, "s1");
        System.out.println(map.get(keyObject));

        keyObject.i += 1;
        System.out.println(map.get(keyObject));
    }

}
