import java.util.*;

//Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//переменную n. Если пользователь ввел не подходящее число, то программа
//должна выдать соответствующее сообщение. Создать массив из n случайных
//целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//только из четных элементов первого массива, если они там есть, и вывести его
//на экран.

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число больше 3 ");
        int num = in.nextInt();

        if (num <= 3) {
            System.out.println("Вы ввели неподходящее число");
        } else {
            Random rnd = new Random();

            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(num + 1);
            }

            System.out.println(Arrays.toString(array));

            List<Integer> list = new ArrayList<>(); // так интереснее
            for (int item: array) if (item % 2 == 0) list.add(item);
            Object[] array2 = list.toArray();

            System.out.println(Arrays.toString(array2));
        }
    }
}
