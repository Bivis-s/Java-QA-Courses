package lesson1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a numbers: ");
        int num = in.nextInt();
        int num2 = in.nextInt();

        if(num > num2) {
            System.out.println(num);
        } else if(num < num2) {
            System.out.println(num2);
        } else {
            System.out.println("same");
        }
    }
}
