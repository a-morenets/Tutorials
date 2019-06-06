package samples.immutableObjects.mistake1;

public class ImmutableStudent {
    private final String name;
    private final Age age;

    public ImmutableStudent(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Age getAge() { return age; }


    //здесь надо исправить
/*
    public void setName(String name) {
        this.name = name;
    }
*/

    //здесь надо исправить
/*
    public void setAge(Age age) {
        this.age = age;
    }
*/

}

