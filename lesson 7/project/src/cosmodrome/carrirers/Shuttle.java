package cosmodrome.carrirers;

import cosmodrome.IStart;
import java.util.Random;

public class Shuttle implements IStart {
    Random rnd = new Random();

    @Override
    public boolean preLaunchCheck() {
        int rndNum = rnd.nextInt(11);
        return rndNum > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла запущены.\nВсе системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Запуск Шаттла");
    }
}
