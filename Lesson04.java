public class Lesson04 {
    public static void main(String[] args) {
        int age = 4;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива!");
            } else {
                System.out.println("Иди куда хочешь и пей, что хочешь!");
            }
        } else {
            if (age > 7) System.out.println("Иди в школу");
            else System.out.println("Иди в детский сад");
        }

        char color = 'g';

        if (color == 'r') {
            System.out.println("Красный, ехать нельзя!");
        } else {
            if (color == 'y') {
                System.out.println("Жёлтый! Внимание!");
            } else {
                System.out.println("Зелёный! Проезд разрешён!");
            }
        }

        System.out.println("Использование оператора switch");
        color = 'y';


        switch (color) {
            case 'r':
                System.out.println("Красный, ехать нельзя!");
                break;
            case 'y':
                System.out.println("Жёлтый! Внимание!");
                break;
            case 'g':
                System.out.println("Зелёный! Проезд разрешён!");
                break;
            case 'l':
                System.out.println("Поворот налево!");
                break;
            default:
                System.out.println("Светофор сломался");
        }

    }
}
