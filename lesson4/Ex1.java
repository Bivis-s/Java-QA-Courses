import java.util.*;

//Посчитать сумму четных элементов стоящих на главной диагонали.

public class Ex1 {
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

        // Считаем сумму чётных элементов в списке
        int evenSum = 0;
        for (int item : mainDiagonalList) {
            if (item % 2 == 0) {
                evenSum += item;
            }
        }

        System.out.println("Главная диагональ: " + mainDiagonalList.toString());
        System.out.println("Сумма чётных элементов главной диагонали: " + evenSum);
    }
}
