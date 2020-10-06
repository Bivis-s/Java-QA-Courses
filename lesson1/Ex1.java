package lesson1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        if(num > 0) {
            num = num + 1;
            System.out.println(num);
        } else if(num < 0) {
            num = num - 2;
            System.out.println(num);
        } else {
            num = 10;
            System.out.println(num);
        }
    }
}
