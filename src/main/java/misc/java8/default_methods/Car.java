package misc.java8.default_methods;

/**
 * Created by Oleksii on 07.07.2017.
 */
class Car implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }

}
