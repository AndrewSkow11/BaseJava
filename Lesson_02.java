public class Lesson_02 {
    public static void main(String[] args) {
        System.out.println("Переменные. Урок 2");

        /* Целочисленный тип:
        1. byte - диапазон [-128; 127]
        2. short
        3. int
        4. long - 8 байт */


        /*
        Тип переменных с плавающей точкой:
        1. float - 7 знаков после запятой (4 байта)
        2. double - 16 знаков после запятой (8 байт)
         */


//        тип переменной указывает на природу хранимых данных

        System.out.println("\nТипы переменных:");

        System.out.println("\nЦелочисленные:");
        System.out.println("Обозначение\tДиапазон\tОбъём памяти");
        System.out.println("byte\tот -128 до 127\t1 байт");
        System.out.println("short\tот -32 768 до 32 767\t2 байта");
        System.out.println("int\t от -2 147 483 648 до 2 147 483 647\n4 байта");
        System.out.println("long\t от -9 223 372 036 854 775 808 до 9 233 372 036 854 775 807\t8 байт");

        System.out.println("\nС плавающей точкой:");
        System.out.println("float: -3.4E+38 до 3.4E+38 (4 байта)");
        System.out.println("double: -1.7E+308 до 1.7E+308 (8 байт)");

        System.out.println("\nСимвольные:");
        System.out.println("char: 0-65536 (2 байта)");


        System.out.println("\nЛогические:");
        System.out.println("boolean: true или false (1 бит)\n\n");

        //целочисленные типы
        byte lesson = 8;
        short course = 9;
        int profession = 11;
        long year = 365L;

        System.out.println(lesson);
        System.out.println(course);
        System.out.println(profession);
        System.out.println(year);



    }

}
