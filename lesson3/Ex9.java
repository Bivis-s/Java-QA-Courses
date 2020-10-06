import java.util.*;

//Пользователь должен указать с клавиатуры положительное число, а
//программа должна создать массив указанного размера из случайных целых
//чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//определить и сообщить пользователю о том, сумма какой половины массива
//больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//пользователь введёт неподходящее число, то выдать соответствующее
//сообщение

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число ");
        int num = in.nextInt();

        if (num <= 0) {
            System.out.println("Вы ввели неподходящее число");
        } else {
            Random rnd = new Random();

            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(16);
            }

            System.out.println(Arrays.toString(array));

            int average = num/2;
            int left_sum = 0, right_sum = 0;
            for (int i = 0; i < average; i++) {
                left_sum += array[i];
            }
            for (int i = average; i < array.length; i++) {
                right_sum += array[i];
            }

            System.out.println(left_sum + " : " + right_sum);

            if (left_sum > right_sum) {
                System.out.println("Сумма левой части массива больше");
            } else if (left_sum < right_sum) {
                System.out.println("Сумма правой части массива больше");
            } else {
                System.out.println("Суммы левой и правой частей массива равны");
            }
        }

    }
}
