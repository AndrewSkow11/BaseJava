import java.util.Arrays;

public class Lesson08 {
    public static void main(String[] args) {
        System.out.println("Arrays. Lesson 2");
        System.out.println("Сравнение двух массивов");
        int[] weights = {90, 91, 93, 92, 85, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 88, 90, 0, 0, 0, 0};
        System.out.println(Arrays.toString(weights));
        if (weights == weightsCopy) System.out.println("Массивы одинаковы");
        else System.out.println("Массивы разные");

//        weightsCopy = weights;
//        weightsCopy[0] = 123;
//        weightsCopy[1] = 93;
//        System.out.println(Arrays.toString(weights));
//        System.out.println(Arrays.toString(weightsCopy));

        boolean arraysEqual = true;
        arraysEqual = weights.length == weightsCopy.length;
        if (arraysEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysEqual = false;
                }
            }
        }

        if (arraysEqual) System.out.println("Массивы одинаковы");
        else System.out.println("Массивы разные");

        // чтобы сравнивать массивы нужно пройтись по ним поэлементно с помощью цикла

        System.out.println("\n3/6. Работа с массивами. Цикл for each");
    }

    // массивы нельзя сравнивать через знак равенства
    // в массиве может быть до 2 миллиардов элементов

    // оператор new выделяет место для элементов массива
    // в переменной хранится не весь массив, а адрес


}
