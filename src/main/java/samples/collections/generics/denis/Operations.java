package samples.collections.generics.denis;

/**
 * Created by Денис on 14.04.2016.
 */
public class Operations<T extends Number> {
    private T value;

    public Operations(T value) {
        this.value = value;
    }

    public void add( T param){
        Double res = value.doubleValue()
                +param.doubleValue();
        value = (T)res;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "value=" + value +
                '}';
    }
}
