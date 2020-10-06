package lesson2;

//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?

public class Ex3 {
    public static void main(String[] args){

        double length = 10.0;
        double full_length = 0;
        for(int i = 0; i <7; i++){
            full_length += length;
            length += length/10;
        }
        System.out.println("Последний круг: " + length);
        System.out.println("Вся длина за 7 дней: " + full_length);
    }
}
