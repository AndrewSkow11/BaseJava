import javax.xml.transform.Source;

public class HomeWork12 {
    public static void main(String[] args) {

        // Реализуйте методы
        // toString
        // equals
        // hashCode
        // в классах Author и Book, которые вы создали на прошлом уроке.

        // Обратите внимание, что toString книги не должен дублировать код из toString автора,
        // а должен делегировать (вызывать) его версию метода.

        // command + N - создать автоматически методы

        System.out.println(new Author("Иван", "Бунин"));
        Author author0 = new Author("Саша", "Пушкин");
        Author author1 = new Author("Саша", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");

        System.out.println(author0.equals(author1)); // true
        System.out.println(author0.equals(author2)); // false

        System.out.println(author0.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println("About Book Class");
        Book book0 = new Book("Войнушка и мирок", author0, 1087);
        Book book1 = new Book("Войнушка и мирок", author0, 1087);
        Book book2 = new Book("Руслан и Людмила", author1, 1799);
        System.out.println(book0);
        System.out.println(book1.equals(book0)); // true
        System.out.println(book1.equals(book2)); // false
        System.out.println(book0.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());




    }
}
