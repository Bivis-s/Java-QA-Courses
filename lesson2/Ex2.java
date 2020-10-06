package lesson2;

//Вычислить: 1+2+4+8+...+256

public class Ex2 {
    public static void main(String[] args) {

        int count = 2;
        int sum = 1;
        while (count <= 256) {
            sum += count;
            count *= 2;
        }

        System.out.println(sum);
    }
}
