package lesson1;

import java.util.Scanner;

//В переменную записываем число. Надо вывести на экран сколько в этом
//        числе цифр и положительное оно или отрицательное.

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        String k;
        if (Math.abs(num) == num) k = " положительное"; else k = " отрицательное";
        int num_abs = Math.abs(num);

        String t;
        if(num_abs < 10) {
            t = " однозначное";
        } else if(num_abs < 100) {
            t = " двузначное";
        } else {
            t = " трёхзначное или более";
        }

        System.out.println("Число " + num + k + t);
    }
}
