package misc.java8;

/**
 * https://www.tutorialspoint.com/java8/java8_default_methods.htm
 * Created by a-morenets on 25.11.2016.
 */
public class DefaultMethods {
    interface Vehicle {
        default void print(){
            System.out.println("I am a vehicle!");
        }

        static void blowHorn(){
            System.out.println("Blowing horn!!!");
        }
    }

    interface FourWheeler {
        default void print(){
            System.out.println("I am a four wheeler!");
        }
    }

    static class Car implements Vehicle, FourWheeler {
        public void print() {
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("I am a car!");
        }

    }

    public static void main(String args[]) {
        Vehicle vehicle = new DefaultMethods.Car();
        vehicle.print();
    }
}
