package block03.encapsulation;

public class Main {
    int getX(){return x;} // x not initialized yet, returns 0
    int y = getX();
    int x=3;

    public static void main(String[] args) {

        // Пример на наследование и инкапсуляцию
        First f = new Second();
        f.addFive(); // prints second
        System.out.println(f.publicValue); // prints 1 (from First class) - no encapsulation (val is public field)
        System.out.println(f.GetValue()); // prints 7 (from Second class) - val encapsulated (private + getter/setter)

        Main main = new Main();
        System.out.println("x = " + main.x);
        System.out.println("y = " + main.y);
    }

}
