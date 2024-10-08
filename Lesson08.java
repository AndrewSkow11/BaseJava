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

        // массивы нельзя сравнивать через знак равенства
        // в массиве может быть до 2 миллиардов элементов

        // оператор new выделяет место для элементов массива
        // в переменной хранится не весь массив, а адрес

        // 3. Работа с массивами. Цикл for each
            /*
            Теперь, когда мы знаем о массивах всё. Ну почти всё...
            Правильно сказать, что мы знаем о массивах много
            Так вот... Теперь можно подумать, что с ними сделать.
            Самое очевидное предложение - брать массив и считать сумму
            значений его элементов. Но у нас тут график прироста живого
            веса, и поэтому считать сумму тут просто бессмысленно.
            Вместо этого мы найдём максимальный вес за год.
             */

            /*
            Принцип поиска максимального элемента в массиве достаточно прост.
            Необходимо завести переменную и пройтись по всем элементам массива.
            Если встретится элемент, который больше переменной, то его и нужно записать в переменную.

            Если повторить эту процедуру для каждого элемента, то в переменной
            автоматически окажется максимум из весов, которые есть в массиве.
            Давайте так и сделаем.

            Интересно узнать, сколько ты весил, когда достиг пика формы.
            Прежде всего объявим переменную, в которой будем хранить максимум.
             */

        // переменная максимума должна быть типа int как и все элементы массива
        int maxWeight = -1;
        System.out.println("Исходный массив: " + Arrays.toString(weights));
        for (int weight : weights)
            if (maxWeight < weight) {
                maxWeight = weight;
            }

        System.out.printf("Максимальный вес в массиве weights: %d\n", maxWeight);

        // модификатор final нужен, чтобы программист не смог поменять значение
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.printf("Максимальный вес в массиве weights: %d\n", maxWeight);


        // продолжение for each
        /*
        C помощью массива, цикла и условного оператора можно
        обрабатывать данные как угодно.
        Хочешь ищи максимум, хочешь ищи минимум.
        Хочешь средний вес, хочешь медиану.
        Но не обязательно выводить какую-то общую статистику.
        Можно посчитать, например, помесячную динамику изменения веса.
        Если в январе вес было 90, а в феврале 87,
        то можно смело сказать, что за январь я похудел на 3 килограмма.
        Код, который покажет нам такую статистику можно написать по-разному.

        Будет показан способ, где в зависимости от задачи можно
        отходить от шаблона цикла и разрабатывать код постепенно.
        Придумывая его на ходу, а не строить с самого начала
        какой-то идеальный план.

        Вот мы хотим посчитать разницу между текущим и следующим месяцами.
        А потом распечатать его.
        Для этого явно нужен цикл, давайте его и напишем.
         */

        // в idea: weights.length.fori + TAB
        // отбиваем tab и получаем цикл, который нам нужен
        for (int i = 0; i < weights.length - 1 && weights[i + 1] > 0; i++) {
            // мы собираемся печатать разницу между текущим и следующим месяцем
            // мы это сделаем, но сначала просто распечатаем вес в текущем месяце
            // чтобы убедиться, что с циклом всё в порядке

            // напишем значения, которые хотим распечатать, т.е.
            // weight[i] ставим точку затем пишем sout и нажимаем tab
            // получаем ощибку ArrayIndexOutOfBoundsException


            // alt + t - для выделенной строки обрамить каким-либо блоком
//            if (weights[i + 1] > 0) {
//                System.out.println(weights[i + 1] - weights[i]);
//            }

            System.out.println(weights[i + 1] - weights[i]);


            // чтобы программа распечатала не текущий вес, а его изменения,
            // нужно в println вычесть из значения следующего месяца вычесть текущее значение
        }


    }


}
