package man.clothes.jackets;

public class Bomber implements IJacket {
    @Override
    public void dress() {
        System.out.println("Надеваю бомбер");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю бомбер");
    }
}
