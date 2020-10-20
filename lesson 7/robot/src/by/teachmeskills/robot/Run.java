package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.*;
import by.teachmeskills.robot.heads.*;
import by.teachmeskills.robot.legs.*;

public class Run {
    static int findMax(int[] args) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHand toshibaHand = new ToshibaHand(5);
        IHand sonyHand = new SonyHand(4);
        IHand samsungHand = new SamsungHand(6);

        IHead toshibaHead = new ToshibaHead(9);
        IHead sonyHead = new SonyHead(10);
        IHead samsungHead = new SamsungHead(12);

        ILeg toshibaLeg = new ToshibaLeg(5);
        ILeg sonyLeg = new SonyLeg(7);
        ILeg samsungLeg = new SamsungLeg(6);

        //---

        Robot robot1 = new Robot(sonyHead, toshibaHand, samsungLeg);
        robot1.action();

        Robot robot2 = new Robot(samsungHead, samsungHand, sonyLeg);
        robot2.action();

        Robot robot3 = new Robot(toshibaHead, sonyHand, toshibaLeg);
        robot3.action();

        System.out.println("Самый дорогой робот № " + (findMax(new int[]{robot1.getPrice(), robot2.getPrice(), robot3.getPrice()}) + 1));
    }
}
