public class HomeWork9 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("\nTask 1");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s.\n", fullName);
    }

    public static void task2() {
        System.out.println("\nTask 2");
        String fullName = "Иванов Иван Иванович";
        fullName = fullName.toUpperCase();
        System.out.printf("Ф. И. О. сотрудника — %s.\n", fullName);
    }

    public static void task3() {
        System.out.println("\nTask 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.printf("Данные Ф. И. О. сотрудника — %s.\n", fullName);
    }
}
