package second;

import java.util.Scanner;

// Даны 2 числа. Вывести большее из них

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 3 целых числа");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int count = 0;

        if (number1 > 0) {
            count++;
        }
        if (number2 > 0) {
            count++;
        }
        if (number3 > 0) {
            count++;
        }

        System.out.println("В наборе " + count + " положительных чисел");
    }
}
