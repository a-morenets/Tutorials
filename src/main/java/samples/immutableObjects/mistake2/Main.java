package samples.immutableObjects.mistake2;

public class Main {

    public static void main(String[] args) {

        // создаем какой то, любой объект класса Age, он mutable
        Age age = new Age();
        age.setYear(10);

        //содаем IMMUTABLE объект класса ImmutableStudent
        ImmutableStudent immutableStudent = new ImmutableStudent("Andrew", age);
        System.out.println("Name : " + immutableStudent.getName() + " | " + "Age : " + immutableStudent.getAge().getYear());

        //пытаемся изменить поля
        age.setYear(30);

        //вывод уже другой, поле изменилось
        //Значит наш объект НЕ IMMUTABLE, следовательно где то ошибка -> ищем и исправляем!!!
        System.out.println("Name : " + immutableStudent.getName() + " | " + "Age : " + immutableStudent.getAge().getYear());

    }
}
