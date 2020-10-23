package cosmodrome;

public class Cosmodrome {
    public static void reCounter(int count) {
        for (int i = count; i > 0; i--) {
            System.out.println(i);
        }
    }

    public void launch(IStart carrier) {
        if (!carrier.preLaunchCheck()) {
            System.out.println("Предстартовая проверка провалилась");
        } else {
            carrier.startEngine();
            reCounter(10);
            carrier.start();
        }
    }
}
