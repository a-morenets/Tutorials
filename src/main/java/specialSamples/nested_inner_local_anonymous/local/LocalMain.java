package specialSamples.nested_inner_local_anonymous.local;

import java.util.ArrayList;

/**
 * Created by Администратор on 01.02.2016.
 */
public class LocalMain {

    public static void main(String[] args) {
        int values[] = {3, 4, 1};

        class Wrapper{
            int val;

            public Wrapper() {
            }

            public Wrapper(int val) {
                this.val = val;
            }

            @Override
            public boolean equals(Object obj) {
                return val == ((Wrapper)obj).val;
            }

            @Override
            public int hashCode() {
                return val;
            }
        }

        ArrayList<Wrapper> list = new ArrayList<>();
        list.add(new Wrapper(values[0]));
        list.add(new Wrapper(values[1]));
        list.add(new Wrapper(values[2]));
        int test[] = {3};
        if (list.contains(new Wrapper() {
            {
                val = test[0];
            }
        })) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }

        Object obj = new Object(){
            @Override
            public int hashCode() {
                return test[0];
            }

            @Override
            public boolean equals(Object obj) {
                return ((Wrapper)obj).val == test[0];
            }
        };
        if (list.contains(obj)){
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }

        test[0] = 100500;
        if (list.contains(obj)){
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
    }
}
