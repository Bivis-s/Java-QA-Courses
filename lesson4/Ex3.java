import java.util.*;

//Вывести нечетные элементы находящиеся под главной диагональю.

public class Ex3 {
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

        // Записываем диагональ ПОД главной в список
        ArrayList<Integer> mainDiagonalBelowList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j < array[i].length) && (i + 1 < array.length)) {
                    if (i == j) {
                        mainDiagonalBelowList.add(array[i + 1][j]);
                    }
                }
            }
        }

        System.out.println("Главная диагональ: " + mainDiagonalBelowList.toString());

        System.out.print("Нечётные элементы: ");
        for (int item : mainDiagonalBelowList) {
            if (item % 2 == 1) {
                System.out.print(item + " ");
            }
        }
    }
}
