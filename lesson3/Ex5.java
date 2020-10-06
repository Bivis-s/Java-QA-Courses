import java.util.Arrays;
import java.util.Random;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//арифметическое элементов каждого массива и сообщите, для какого из
//массивов это значение оказалось больше (либо сообщите, что их средние
//арифметические равны).

public class Ex5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0, sum2 = 0;
        double median1, median2;
        Random rnd = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(16);
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rnd.nextInt(16);
            sum2 += array2[i];
        }

        median1 = (double) sum1 / array1.length;
        median2 = (double) sum2 / array2.length;

        System.out.println(Arrays.toString(array1) + " Среднее арифметическое: "
                + median1);
        System.out.println(Arrays.toString(array2) + " Среднее арифметическое: "
                + median2);

        if (median1 > median2) {
            System.out.println("Массив 1 в среднем больше");
        } else if (median1 < median2) {
            System.out.println("Массив 2 в среднем больше");
        } else {
            System.out.println("Массивы равны");
        }

    }
}
