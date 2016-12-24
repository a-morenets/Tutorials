package samples.collections.generics.training.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Денис on 16.11.2016.
 */

class Holder<E>{
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Holder(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "value=" + value +
                '}';
    }
}

interface Filter<E>{
    boolean apply(E element);
}

// 1 class ItemCollection<E>{
//2 class ItemCollection<E extends Number>{
// 3 class ItemCollection<E extends Number>{
 class ItemCollection<E>{

    private List<E> values = new ArrayList<>();

    public void add(E value){
        values.add(value);
    }

    public void add(Holder<? extends E> value){
        values.add(value.getValue());
    }

    public void getFirstElement( Holder<? super E> fistElement ){
        fistElement.setValue(values.get(0));
    }

    public void printElementsByFilter( Filter<? super E> filter){
        for(E e : values){
            if( filter.apply(e) ){
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString() {
        double sum = 0;
//        for(E el : values){ only 2-3
//            sum += el.doubleValue();
//        }

        return "ItemCollection{" +
                "values=" + values +
                " sum=" + sum +
                '}';
    }
}

public class ParametrisedGenerics {
    public static void main(String[] args) {
        Holder<Integer> intHolder = new Holder<>(3);

        Holder<String> stringHolder = new Holder<>("123131");
        //ItemCollection<Integer> col = new ItemCollection<>();
       // ItemCollection<String> stringItemCollection;
       // ItemCollection<Number> col = new ItemCollection<>(); // for Number Holder as Producer
        ItemCollection<Integer> col = new ItemCollection<>(); // for Number Holder as Consumer

        col.add(100500);
        col.add(100501);
        col.add(1);
       // col.add(100500.);
        col.add(intHolder);  //PECS

        Holder<Number> first = new Holder<>(0);
        col.getFirstElement(first);

        //col.add()
        //col.add("12121");
        //col.add(stringHolder);
        System.out.println(col);
        System.out.println(first);
        Filter<Number> filter = new Filter<Number>() {
            @Override
            public boolean apply(Number element) {
                return element.doubleValue() > 5. ;
            }
        };
        col.printElementsByFilter(filter);
        col.printElementsByFilter( (element) -> element.doubleValue() > 5. );

    }
}
