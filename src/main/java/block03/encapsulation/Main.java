package block03.encapsulation;

public class Main {

    public static void main(String[] args) {
        // Пример на наследование и инкапсуляцию
        First f = new Second();
        f.addFive(); // prints second
        System.out.println(f.publicValue); // prints 1 (from First class) - no encapsulation (val is public field)
        System.out.println(f.GetValue()); // prints 7 (from Second class) - val encapsulated (private + getter/setter)
    }

}
