package block03.init2;

public class Base {
    int x = 10;

    Base() {
        System.out.println("Base constr");
        show();
    }

    void show() {
        System.out.println("Base Show " + x + "  ");
    }
}
