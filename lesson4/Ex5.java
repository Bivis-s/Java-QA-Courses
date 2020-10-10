import java.util.*;

//Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//строкой и т. д.)

public class Ex5 {
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

        System.out.println("Новый массив: ");

        // Создаём второй массив
        int[][] array2 = new int[num2][num];

        // Заполняем второй массив значениями из первого
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }

        // Выводим второй массив
        for (int[] item : array2) {
            for (int item2 : item) {
                System.out.print(item2 + " ");
            }
            System.out.println();
        }

    }
}