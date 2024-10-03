import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void printBookInfo() {
        System.out.println(this.name + " - " + this.author.firstName + " " + this.author.lastName + " - " + yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\n' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}
