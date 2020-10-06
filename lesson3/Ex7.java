import java.util.Arrays;
import java.util.Random;

//Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.

public class Ex7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(16);
        }

        System.out.println(Arrays.toString(array));

        int max_index = -1, max = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {max = array[i]; max_index = i;}
        }

        System.out.println("Максимальный элемент в массве: " + max);
        System.out.println("Индекс его последнео вхождения: " + max_index);
    }
}
