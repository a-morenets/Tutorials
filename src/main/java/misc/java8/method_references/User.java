package misc.java8.method_references;

/**
 * Created by Oleksii on 07.07.2017.
 */

@FunctionalInterface
interface UserBuilder0 {
    User createUser(); // 0-argument (default) constructor
}

@FunctionalInterface
interface UserBuilder1 {
    User createUser(String name); // 1-argument constructor
}

@FunctionalInterface
interface UserBuilder2 {
    User createUser(String name, int age); // 2-argument constructor
}


class User {
    private String name;
    private int age;

    /* 0-argument (default) constructor */
    public User() {
    }

    /* 1-argument constructor */
    public User(String name) {
        this.name = name;
    }

    /* 2-argument constructor */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
