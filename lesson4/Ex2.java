import java.util.*;

//Проверить произведение элементов какой диагонали больше.

public class Ex2 {
    private static int multiplyList(List<Integer> list) {
        int result = 1;
        for (int item : list) {
            result *= item;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите число строк ");
        int num = in.nextInt();
        System.out.println("Введите число столбцов ");
        int num2 = in.nextInt();

        int[][] array = new int[num][num2];

        // Заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }

        // Выводим массив
        for (int[] item : array) {
            for (int item2 : item) {
                System.out.print(item2 + " ");
            }
            System.out.println();
        }

        // Записываем главную диагональ в список
        ArrayList<Integer> mainDiagonalList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j < array[i].length) {
                    if (i == j) {
                        mainDiagonalList.add(array[i][j]);
                    }
                }
            }
        }

        // Записываем побочную диагональ в список
        ArrayList<Integer> subDiagonalList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j < array[i].length) {
                    if (i == j) {
                        subDiagonalList.add(array[i][array[i].length - i - 1]);
                    }
                }
            }
        }

        System.out.println("Главная диагональ: " + mainDiagonalList.toString());
        System.out.println("Побочная диагональ: " + subDiagonalList.toString());

        int a = multiplyList(mainDiagonalList),
                b = multiplyList(subDiagonalList);
        if (a > b) {
            System.out.println("Произведение главной диагонали больше");
        } else if (a < b) {
            System.out.println("Произведение побочной диагонали больше");
        } else {
            System.out.println("Произведения диагоналей равны");
        }

    }
}
