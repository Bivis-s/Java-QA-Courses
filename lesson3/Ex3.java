import java.util.Arrays;
import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//это количество на экран на отдельной строке.

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int item: array) {
            if (item % 2 == 0) {
                count++;
            }
        }

        System.out.println("Количество чётных элементов: " + count);

    }

}
