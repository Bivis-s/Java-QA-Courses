package lesson2;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Ex5 {
    public static int multiply(int a, int b) {

        int result = 0;
        for(int i = 0; i < a; i++) {
            result +=  b;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(multiply(5, 9));
        System.out.println(multiply(6, 0));
        System.out.println(multiply(7, 10));
    }
}
