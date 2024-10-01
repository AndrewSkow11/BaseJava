import javax.xml.transform.Source;

public class HomeWork10 {
    public static void main(String[] args) {
        task1(2021); // является ли год високосным
        task1(2024); // является ли год високосным

        task2(0, 2014);
        task2(1, 2023);

        int distance = 95;
        if (task3(distance) != -1) System.out.printf("На доставку потребуется %d суток", task3(distance));
        else System.out.println("Доставка невозможна");

    }

    public static void task1(int year) {
        if (year < 1584) System.out.println(year + " год - невисокосный, т.к. високосный год был введён только в 1854");
        else {
            if (year % 100 == 0) System.out.println(year + " год - невисокосный, т.к. кратен 100");
            else if (year % 4 == 0 || year % 400 == 0)
                System.out.println(year + " год - високосный, т.к. кратный 400 или 4");
            else System.out.println(year + " год - невисокосный!");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear > 2015) System.out.println("Установите версию приложения для iOS по ссылке");
                else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear > 2015) System.out.println("Установите версию приложения для Android по ссылке");
                else System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Операционная система не распознана!");
        }
    }

    public static int task3(int distance) {
        if (distance < 20) return 1;
        else if (distance >= 20 && distance < 60) return 2;
        else if (distance < 100) return 3;
        else return -1;
    }
}
