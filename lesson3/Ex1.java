//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//созданием массива подумайте, какого он будет размера.

public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        int num = 2;
        for(int i = 0; i < array.length; i += 1) {
            array[i] = num;
            num += 2;
        }

        for(int item: array) {
            System.out.print(item + " ");
        }

        System.out.println();

        for(int item: array) {
            System.out.println(item);
        }
    }
}
