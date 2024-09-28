import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {


        //    Задача 1
        //    Объявите три массива:
        //    Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new

        System.out.println("\nЗАДАЧА 1");
        int intArray[] = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray));

        //    Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float floatArray[] = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(floatArray));


        //    Произвольный массив. Тип и количество данных определите сами.
        //    Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        char charArray[] = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(charArray));


        //    Задача 2
        //    Распечатайте на отдельной строчке элементы каждого
        //    массива по порядку через запятую. В конце строки запятую ставить не надо.
        System.out.println("\nЗАДАЧА 2");
        for (int i = 0; i < intArray.length; i++) {
            if (i != intArray.length - 1) System.out.printf("%d, ", intArray[i]);
            else System.out.print(intArray[i]);
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            if (i != floatArray.length - 1) System.out.printf("%f, ", floatArray[i]);
            else System.out.print(floatArray[i]);
        }
        System.out.println();
        for (int i = 0; i < charArray.length; i++) {
            if (i != charArray.length - 1) System.out.printf("%c, ", charArray[i]);
            else System.out.print(charArray[i]);
        }


        //    Задача 3
        //    Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        //    В конце строки запятую ставить не надо.
        //            Если в задаче 2 в консоль у вас вывелся результат:
        //    1, 2, 3
        //    1.57, 7.654, 9.986
        // Произвольные элементы третьего массива
        //    то в этой задаче результат должен быть таким:
        //    3, 2, 1
        //    9.986, 7.654, 1.57
        // Произвольные элементы третьего массива в обратном порядке
        System.out.println("\nЗАДАЧА 3");
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i != 0) System.out.printf("%d, ", intArray[i]);
            else System.out.print(intArray[i]);
        }
        System.out.println();
        for (int i = floatArray.length - 1; i >= 0; i--) {
            if (i != 0) System.out.printf("%f, ", floatArray[i]);
            else System.out.print(floatArray[i]);
        }
        System.out.println();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (i != 0) System.out.printf("%c, ", charArray[i]);
            else System.out.print(charArray[i]);
        }


        //    Задача 4
        //    Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        //    (нужно прибавить 1).
        //            Важно: код должен работать с любым
        //            целочисленным массивом, поэтому для решения задания используйте циклы.
        //            Распечатайте результат преобразования в консоль.
        System.out.println("\nЗАДАЧА 4");
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] % 2) != 0) intArray[i] += 1;
        }
        System.out.println(Arrays.toString(intArray));


    }
}
