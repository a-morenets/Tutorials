package misc.java8.default_methods;

/**
 * Created by Oleksii on 07.07.2017.
 */
interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }
}
