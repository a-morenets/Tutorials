package block03.init;

public class Child extends Base {
    Child() {
        System.out.println("Child constr");
        show();
    }

    public static void main(String s[]) {
        new Child();
    }

    void show() {
        System.out.println("Child Show " + x + "  ");
    }
}
