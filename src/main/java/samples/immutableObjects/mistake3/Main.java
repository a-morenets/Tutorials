package samples.immutableObjects.mistake3;

public class Main {

    public static void main(String[] args) {

        //содаем IMMUTABLE объект класса ImmutableStudent
        ImmutableStudent immutableStudent = new ImmutableStudent("Andrew", new Age(10));
        System.out.println("Name : " + immutableStudent.getName() + " | " + "Age : " + immutableStudent.getAge().getYear());

        //пытаемся что то сломать
        immutableStudent.getAge().setYear(50);
        immutableStudent.setName("Petro");

        //вывод уже другой, поле изменилось
        //Значит наш объект НЕ IMMUTABLE, следовательно где то ошибка -> ищем и исправляем!!!
        System.out.println("Name : " + immutableStudent.getName() + " | " + "Age : " + immutableStudent.getAge().getYear());

    }
}
