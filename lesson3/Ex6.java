import java.util.Arrays;
import java.util.Random;

//Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//на экран в строку. Определить и вывести на экран сообщение о том, является ли
//массив строго возрастающей последовательностью.

public class Ex6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);
        }

        System.out.println(Arrays.toString(array));

        boolean is_progressive = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                is_progressive = false;
                break;
            }
        }

        if (is_progressive) {
            System.out.println("Массив в строго возрастающей прогрессии");
        } else {
            System.out.println("Массив не в строго возрастающей прогрессии");
        }
    }
}
