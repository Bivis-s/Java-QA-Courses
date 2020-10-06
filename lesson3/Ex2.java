//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//порядке (99 97 95 93 ... 7 5 3 1).

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[50];

        int num = 1;
        for (int i = 0; i < array.length; i += 1) {
            array[i] = num;
            num += 2;
        }

        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
