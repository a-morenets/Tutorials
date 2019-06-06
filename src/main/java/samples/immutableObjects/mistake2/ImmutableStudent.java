package samples.immutableObjects.mistake2;

public class ImmutableStudent {
    private final String name;
    private final Age age;

    //подсказка, здесь что то не так!!!
    public ImmutableStudent(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Age getAge() { return age; }


    public ImmutableStudent setName(String name) {
        return new ImmutableStudent(name, this.age);
    }

    public ImmutableStudent setAge(Age age) {
        return new ImmutableStudent(this.name, age);
    }
}
