import java.util.Arrays;
import java.util.Random;

//Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//массив на экран в строку. Замените каждый элемент с нечетным индексом на
//ноль. Снова выведете массив на экран на отдельной строке.

public class Ex4 {
    public static void main(String[] args){
        int[] array = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));

    }
}
