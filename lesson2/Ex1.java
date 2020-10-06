package lesson2;

//Напишите программу, определяющую сумму всех нечетных чисел от 1
//до 99

public class Ex1 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        while (count < 100) {
            if(count % 2 == 1) {
                sum += count;
            }
            count += 1;
        }

        System.out.println(sum);
    }
}
