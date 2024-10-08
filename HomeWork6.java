public class HomeWork6 {
    public static void main(String[] args) {
        //1. Домашнее задание

        //Задача 1
        //Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
        //С помощью цикла while посчитайте,
        // сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев,
        // которое необходимо для накопления данной суммы.
        // Формат сообщения: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("\nTask 1");
        int total = 0;
        int savedSum = 15_000;
        int month = 1;
        int goal = 2_459_000;

        while (total <= goal) {
            total += savedSum;
            month++;
        }

        System.out.println("Месяц: " + month + ",\tсумма накоплений равна " + total + " рублей»");


        //Задача 2
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
        //        Не забудьте выполнить переход на новую строку между двумя циклами.
        //        В результате программы вывод должен получиться следующим:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1
        System.out.println("\nTask 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        while (i > 1) {
            i--;
            System.out.print(i + " ");
        }


        //Задача 3
        //В стране Y население — 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
        System.out.println("\nTask 3");
        int currentPopulation = 12_000_000;
        int birthrate = 17; // на 1000
        int mortality = 8; // на 1000

        for (int year = 1; year <= 10; year++) {
            currentPopulation += currentPopulation / 1000 * birthrate;
            currentPopulation -= currentPopulation / 1000 * mortality;
            System.out.println("Год " + year + ", численность населения составляет " + currentPopulation);
        }


        //Задача 4
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        // Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
        // а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        System.out.println("\nTask 4");
        int startSum = 15_000;
        int goalForClient = 12_000_000;
        int currentSum = startSum;
        month = 0;
        while (currentSum <= goalForClient) {
            month++;
            currentSum += currentSum * 0.07;

            System.out.println("Месяц " + month + ", сумма накоплений " + currentSum);
        }

        //Задача 5
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        System.out.println("\nTask 5");
        currentSum = startSum;
        month = 0;
        while (currentSum <= goalForClient) {
            month++;
            currentSum += currentSum * 0.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений " + currentSum);
        }


        //Задача 6
        //Василий решил, что будет копить деньги ближайшие 9 лет.
        //Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        //        Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
        //        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        System.out.println("\nTask 6");
        currentSum = startSum;
        month = 1;
        for (; month <= 12 * 9; month++) {
            currentSum += currentSum * 0.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений " + currentSum);
        }

        //Задача 7
        //В компании пятница — отчетный день.
        //Нужно написать программу, которая считает дни месяца по датам,
        // определяет, какой день — пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
        System.out.println("\nTask 7");
        int numberFriday = 7;
        for (; numberFriday <= 31; numberFriday += 7) {
            System.out.println("«Сегодня пятница, " + numberFriday + "-е число. Необходимо подготовить отчет».");
        }


        //Задача 8
        //Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        // а также следующий год ее появления (ближайшие 100 лет).
        //        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        //        В результате решения задачи в консоли должен получиться следующий результат:
        //1896
        //1975
        //2054

        System.out.println("\nTask 8");
        int currentYear = 2024;

        for (int year = 0; year <= currentYear + 100; year += 79) {
            if (year >= currentYear - 200 && year <= currentYear + 100) {
                System.out.println(year);
            }
        }


    }
}
