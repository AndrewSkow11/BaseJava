public class Lesson03 {
    public static void main(String[] args) {
        System.out.println("Условные оператор, часть 1\n");
//        Разделы урока:
//        Понятие условного оператора
//        операции сравнения и их применение
//        Логические переменные
//        Комбинация логических переменных и условных операторов

// условный опретор - конструкция, с помощью которой мы можем запустить код, только если выполняются условия, которые мы прописали
//        Для вызова условного оператора мы используем конструкцию if (в скобках должно быть прописано условие, которое должно выполняться)
        int age = 8;
        if (age >= 18) {
            System.out.println("Ты можешь водить машину");
        } else {
            System.out.println("Ты НЕ можешь водить машину!");
        }


        System.out.println("\n3. Операции сравнения и логические переменные");

        age = 19;

        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить, " + "но недостаточно взрослый, чтобы пить алкоголь.");
        }
        boolean canNotGoToSchool = age < 7 || age > 18;

        if (canNotGoToSchool) {
            System.out.println("Я думаю ты не ходишь в школу!");
        }


//        Логические переменные boolean - нужны для того, чтобы в них хранить значения вычислений,
//        а также значения true or false

    }
}
