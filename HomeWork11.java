public class HomeWork11 {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Сергей", "Есенин");

        Book book1 = new Book("Война и мир", author1, 1900);
        Book book2 = new Book("Cтишки", author2, 1900);

        book1.printBookInfo();
        book2.printBookInfo();

    }
}
