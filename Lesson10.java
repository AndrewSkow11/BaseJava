import java.util.Arrays;

public class Lesson10 {

    public static void printSeparator() {
        System.out.println("===========");
        System.out.println("===========");
    }

    public static void printIssues(int issueCount) {
        // scope - область видимости переменной
        // переменную, объявленную внутри фигурных скобок можно использовать только внутри этих скобок

        // за пределами фигурных скобок переменные не видны

        // в одном scope не может быть больше двух переменных с одним именем
        System.out.println(issueCount);
    }

    public static int sum(int[] issueByMonth) {
        int total = 0;
        for (int i = 0; i < issueByMonth.length; i++) {
            total += issueByMonth[i];
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Урок 10. Методы");
        // методы без объектов - статические методы

        // метод - конструкция, которая позволяет взять несколько строк кода
        // дать этим строкам какое-то имя и потом в программе написать эти строки, а не писать имя метода

        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();

        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }
}

// пул строк - механизм, который позволяет хранить в памяти
// компьютера только один экземпляр строки с идентичным содержанием