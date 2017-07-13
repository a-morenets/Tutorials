package misc.equals_hashcode;

/**
 * Created by user on 27.10.2014.
 */
public class MainEqualsHashCode {

    public static void main(String[] args) {
        ClassHash classHash1 = new ClassHash(33);
        ClassHash classHash2 = new ClassHash(33);
        System.out.println("classHash1.hashCode() = " + classHash1.hashCode());
        System.out.println("classHash2.hashCode() = " + classHash2.hashCode());
        System.out.println("classHash1.equals(classHash2) ? " + classHash1.equals(classHash2));
        System.out.println("classHash1.hashCode() == classHash2.hashCode() ? " + (classHash1.hashCode() == classHash2.hashCode()));
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((new ClassHash(i)).hashCode());
            System.out.print("\t : ");
            System.out.print((new ClassHash(i)).hashCode() & 0x7fffffff); // mask 0x7fffffff avoids negative values
            System.out.print("\t : ");
            System.out.println(Math.abs((new ClassHash(i)).hashCode()));
        }
        System.out.println();

        ClassStd classStd1 = new ClassStd();
        ClassStd classStd2 = new ClassStd();
        System.out.println("classStd1.hashCode() = " + classStd1.hashCode());
        System.out.println("classStd2.hashCode() = " + classStd2.hashCode());
        System.out.println("classStd1.equals(classStd2) ? " + classStd1.equals(classStd2));
        System.out.println("classStd1.hashCode() == classStd2.hashCode() ? " + (classStd1.hashCode() == classStd2.hashCode()));
        System.out.println();

        // если equals() и hashCode() не переопределять, то все экземпляры одного класса НЕ будут равны!
        for (int i = 0; i < 10; i++) {
            System.out.println((new ClassStd()).hashCode());
        }
    }

}
