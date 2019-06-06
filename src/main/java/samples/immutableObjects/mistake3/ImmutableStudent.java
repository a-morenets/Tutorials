package samples.immutableObjects.mistake3;

public class ImmutableStudent {
    private final String name;
    private final Age age;

    public ImmutableStudent(String name, Age age) {
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    //почему здесь всё нормально ???
    public String getName() {
        return name;
    }

    //подсказка, здесь что то не так
    public Age getAge() {
        return age;
    }


    public ImmutableStudent setName(String name) {
        return new ImmutableStudent(name, this.age);
    }

    public ImmutableStudent setAge(Age age) {
        return new ImmutableStudent(this.name, age);
    }
}
