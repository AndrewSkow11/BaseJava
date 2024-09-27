public class Lesson06 {
    public static void main(String[] args) {
        System.out.println("Циклы. Урок 2");
        // while, do-while loops
        // break and continue in loops
        System.out.println("\nDo-While loop");
        // в Java можно писать нижние подчёркивания между цифрами числа
        int manyMoney = 1_000_000;
        System.out.println(manyMoney);
        int salary = 65_535;
        int total = 0;
        for (int i = 0; total <= 1_000_000; i++) {
            total += total / 100;
            total += salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }

        System.out.println('\n');
        total = 0;
        for (; total < 1_000_000; ) {
            total += total * 0.01 + salary;
            System.out.println(total);
        }

        System.out.println('\n');
        total = 0;
        while (total < 1_000_000) {
            total += total * 0.01 + salary;
            System.out.println(total);
        }

        System.out.println('\n');
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start -= 1;
        }

        System.out.println('\n');
        int days = 5;

        if (days == 0) {
            System.out.println("Желаем приятной поездки");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней");
            }
            System.out.println("Путешествие окончено, пора возвращаться домой");
        }

        System.out.println('\n');
        days = 3;

        if (days == 0) {
            System.out.println("Желаем приятной поездки");
        } else {
            for (; days > 0; ) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней");
            }
            System.out.println("Путешествие окончено, пора возвращаться домой");
        }

        System.out.println('\n');
        int i = 0;
        total = 0;
        for (; total < 10_000_000; i++) {
            total += total / 100 + salary;
            if (i % 5 == 0) {
                System.out.println("Mount:\t" + i + "\tTotal:\t" + total);
            }
        }


        System.out.println('\n');
        System.out.println("Do-While loop");
        start = 10;
        do {
            System.out.println(start);
            start--;
        }
        while (start > 0);

        int userWantsToContinue = 1;
        // 1 - хочет
        // 0 - не хочет

        int level = 1;
        do {
            System.out.println("Завершён уровень\t" + level);
            System.out.println("Do you want to continue?");
            level++;
        }
        while (userWantsToContinue == 1 && level < 5);


        int points = 10;
        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Game is OVER");
    }
}
