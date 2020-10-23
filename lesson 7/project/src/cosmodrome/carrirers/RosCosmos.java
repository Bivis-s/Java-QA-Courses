package cosmodrome.carrirers;

import cosmodrome.IStart;

import java.util.Random;

public class RosCosmos implements IStart {
    Random rnd = new Random();

    @Override
    public boolean preLaunchCheck() {
        int rndNum = rnd.nextInt(2);
        return rndNum == 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Удивительно, но ничего не сломалось.\nДвигатели запущены");
    }

    @Override
    public void start() {
        System.out.println("Запуск носителя Роскосмоса. Молитесь");
    }
}
