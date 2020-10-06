package lesson1;

import java.util.Scanner;

//В переменную записываете количество программистов. В
//        зависимости от количества программистов необходимо вывести правильно
//        окончание.

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число программистов: ");
        int num = in.nextInt();

        int k;
        if (Math.abs(num) == num) k = 1; else k = -1; //Проверка на положительность
        num = Math.abs(num);

        if((num % 10 == 0) || (num % 10 >= 5) || (num % 100 > 10 && num % 100 <= 14)) {
            System.out.println(num*k + " программистов");
        } else if(num % 10 == 1) {
            System.out.println(num*k + " программист");
        } else if((num % 10 > 1 && num % 10 <= 4)){
            System.out.println(num*k + " программиста");
        }
    }
}
