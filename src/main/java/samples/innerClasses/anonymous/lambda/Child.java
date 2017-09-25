/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.anonymous.lambda;

/**
 * @author Денис
 */
public class Child extends Parent {

    @Override
    public String toString() {
        return "Child{" + '}';
    }

    void go() {
        int f = 0;
        Runnable r = () -> {
            System.out.println(f);
            System.out.println(this.toString());
            System.out.println(super.toString());
        };
        r.run();

        r = new Runnable() {
            int ff = f;

            public void run() {
                System.out.println(ff);
                System.out.println(this.toString());
                System.out.println(super.toString());
                System.out.println(Child.this.toString());
                System.out.println(Child.super.toString());
            }

            @Override
            public String toString() {
                return "Anonymous{" + "ff=" + ff + '}';
            }

        };
        r.run();
    }
}
