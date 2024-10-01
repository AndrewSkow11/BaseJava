public class Person {
    private String name;
    private int age;


    // конструктор - метод, который создаёт объект
    // конструктор должен называться также как и класс
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // если в Java нет конструктора, то она делает его сама,
    // без параметров - конструктор по умолчанию

    // конструктор без параметров
    public Person() {
    }

    // конструктор - это такой метод, внутри которого Java создаёт объект и записывает в его адрес переменную this,
    // а потом возвращает эту переменную из метода

    // геттеры и сеттеры
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
