public class Lesson09 {

    public static void plan1() {
        System.out.println("1. План урока");
        System.out.println("\t- тип данных String");
        System.out.println("\t- метод length");
        System.out.println("\t- метод throw new RuntimeException()");
        System.out.println("\t-методы charAt(), replace(), equals()");
        System.out.println("Другие методы для работы со строками:");
        System.out.println("equalIgnoreCase()," +
                "isEmpty()," +
                "isBlank()," +
                "contains()," +
                "endsWith()," +
                "startWith()," +
                "trim()," +
                "split()," +
                "toCharArray()," +
                "repeat()");
    }

    public static void part2() {
        System.out.println("\n2. Строки. Конкатенация строк. Метод length()");
        // в реальности программист проводит много времени с данными,
        // которые пришли от клиента.
        // клиенты имеют обыкновение вводить данные как захотят
        // номер телефона можно ввести очень разными способами
        // в базе данных нужно хранить номера в одном формате
        // но позволять вводить пользователю в любом формате

        // будем преобразовать пользовательский ввод к формату 79990001122

        // String - тип данных
        // строки пишутся только в двойных кавычках
        String phoneNumber = "960 111-22-33";
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");

        // command + option + T - контекстное меню для выделенной строки
        if (phoneNumber.length() == 10) {
            phoneNumber = "7" + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Номер телефона слишком длинный!");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Номер телефона слишком короткий!");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("Зарубежные номера не доступны");
        }
        System.out.println("phoneNumber = " + phoneNumber);

        String expectedPhone = "79601112233";

        if (phoneNumber.equals(expectedPhone)) {
            System.out.println("Номер телефона успешно преобразован!");
        } else {
            System.out.println("Номер телефона не удалось преобразовать!");
        }

        // строки нельзя сравнивать через == как и другие объекты (в частности массивы)

        // строка это тоже объект и у неё тоже есть длина как и у массива
        // у строки length() - это не свойство, а метод
        // метод - это команда или несколько команд (совокупность команд),
        // которые позволяют нам выполннить какие-то действия или команды в программе
        // метод - это не переменная, хоть и вызывается у объекта тоже через точку
    }

    public static void part3() {
        System.out.println("3. Methods chatAt and replace()");

    }

    public static void part4() {
        System.out.println("4. Method equals()");

    }

    public static void main(String[] args) {
        plan1();
        part2();
        part3();
        part4();
    }
}
