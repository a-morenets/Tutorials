package samples.immutableObjects.mistake1;

public class Main {

    public static void main(String[] args) {

        // создаем какой то, любой объект класса Age, он mutable
        Age age = new Age();
        age.setYear(10);

        //содаем IMMUTABLE объект класса ImmutableStudent
        ImmutableStudent immutableStudent = new ImmutableStudent("Andrew", age);
        System.out.println("Name : " + immutableStudent.getName() + " | " + "Age : " + immutableStudent.getAge().getYear());

        // пытаемся изменить поля
        // но ничего не получится, даже компилятор ругается -> ищем ошибку и исправляем
//        immutableStudent.setAge(new Age(20));
//        immutableStudent.setName("Ivan");



    }
}
