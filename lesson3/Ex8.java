import java.util.Arrays;
import java.util.Random;

//Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три
//массива на экран (каждый на отдельной строке), затем вывести количество
//целых элементов в третьем массиве.

public class Ex8 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(10);
        }

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rnd.nextInt(10);
        }

        double[] array3 = new double[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / array2[i];
        }

        int count = 0;
        for (double item: array3) {
            if (item == (int) item) {
                count++;
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("Количество целых элементов в массиве 3: " + count);
    }
}
