// в переменных с объектами хранятся не сами объекты, а их адреса
// объекты - самая важная часть Java
// Java - объектно-ориентированный язык

// классы (тип данных) в Java создают в отдельных файлах

// объекты - это переменные, у которых могут быть свойства


// 4. Модификатор static. Геттеры и сеттеры. Инкапсуляция
// без модификатора static методы отличаются наличием переменной this
// после того как конструктор заканчивает работу она никуда не пропадает
// а так и остаётся прикреплённой к объекту
// она доступна внутри всех методов этого объекта

// инкапсуляция - концепция, согласно, которой мы не даём
// доступ к свойствам объектов объекта,
// а получаем их через методы

// инкапсуляция - сокрытие



public class Lesson11 {

    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 31);
        sarah.increaseAge(25);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());

        Person john = new Person("John", 13);
        john.setName("Джон");
        john.increaseAge(14);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

    }

}
