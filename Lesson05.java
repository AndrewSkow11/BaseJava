public class Lesson05 {
    public static void main(String[] args) {
        System.out.println("Урок о циклах");
        // types of loops:
        // 1. for
        // 2. while
        // 3. do-while
        System.out.println("\nFor LOOP");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nЗадача с високосным годом");
        for (int i = 2020; i < 2070; i += 4 ) {
            System.out.println("Високосный год: " + i);
        }
        System.out.println("\n4. Пример задач с вычислениями");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total += total/100;
            total += salary;
            System.out.println("Месяц: " + (i+1) + ", зарплата и процент: " + total);
        }
    }
}
