package cosmodrome.carrirers;

import cosmodrome.IStart;

import java.util.Random;

public class SpaceX implements IStart {
    Random rnd = new Random();

    @Override
    public boolean preLaunchCheck() {
        int rndNum = rnd.nextInt(31);
        return rndNum > 5;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели запущены.\nСлавься, Илон!");
    }

    @Override
    public void start() {
        System.out.println("Запуск носителя SpaceX");
    }
}
