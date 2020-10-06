package second;

import java.util.Scanner;

// Даны 3 целых числа. Найти количество положительных чисел в исходном
//наборе.

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 3 целых числа");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int negative_count = 0;
        int positive_count = 0;

        if (number1 > 0) {
            positive_count++;
        } else if (number1 < 0) {
            negative_count++;
        }
        if (number2 > 0) {
            positive_count++;
        } else if (number2 < 0) {
            negative_count++;
        }
        if (number3 > 0) {
            positive_count++;
        } else if (number3 < 0) {
            negative_count++;
        }

        System.out.println("В наборе " + positive_count + " положительных чисел и " + negative_count + " отрицательных");
    }
}
