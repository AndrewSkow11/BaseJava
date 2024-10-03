// свойства объекта принято называть полями
// переопределение методов


// метод toString есть во всех объектах,
// он позволяет передавать строковое предстпавлении объекта



public class Lesson12 {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        PersonService personService = new PersonService();
        if (personService.isAdult(sarah)) {
            System.out.println("Можно идти в бар!");
        } else {
            System.out.println("Нельзя идти в бар!");
        }
        System.out.println(sarah);
        sarah.increaseAge(32);
        System.out.println(sarah);


        // анемичная модель: в классе есть только геттеры и сеттеры
        // все остальные методы вынесены в другой сервисный класс
    }
}
