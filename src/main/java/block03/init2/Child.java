package block03.init2;

public class Child extends Base {
    int x = 20;

    Child() {System.out.println("Child constr");show();
    }

    public static void main(String s[]) {new Child();
    }

    void show() {System.out.println("Child Show " + x + "  ");
    }
}
