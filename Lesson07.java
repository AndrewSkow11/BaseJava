import java.util.Arrays;

public class Lesson07 {
    public static void main(String[] args) {
        System.out.println("Массивы ");
        // массив - это непрерывная область памяти в которой хранятся однотипные данные
        // массив - это структура данных, в которой можно одновременно хранить несколько значений.
        // у каждого из этих значений есть свой номер, по которому можно прочитать или записать новое значение

        // место, где хранится значение называется ячейкой или элементом массива
        // элементом может называться не только место, где находится значение, но и само значение
        // в зависимости от контекста


        // все переменные, которые мы использовали до этого называются примитивами
        // объект - сложная переменная
        int [] weights = new int [12]; // 12 задаёт количество ячеек в массиве
        // после создания массива изменить количество ячеек уже нельзя
        weights[0] = 90;

        int januaryWeight = weights[0];
        System.out.println("Вес за январь: " + januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[1]); // 0
        System.out.println(weights[2]); // 0
        // вызовет ошибку
        //System.out.println(weights[13]);


        // в java в пустых ячейках массива ставится автоматически 0

        int january = 0;
        System.out.println(weights[january]);

        System.out.println("Комбинация циклов и массивов");
        System.out.printf("Целое число %d\n", 12);

        for (int i = 0; i < 12; i++) {
            System.out.printf("Элемент %d массива: %d\n", i, weights[i]);
        }
        int [] weightArray = {90, 95, 93, 92, 94, 95, 96, 90, 85, 80, 71, 65};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weightArray[i]);
        }
        System.out.println(Arrays.toString(weightArray));
        // массив в java - это объект
    }
}
