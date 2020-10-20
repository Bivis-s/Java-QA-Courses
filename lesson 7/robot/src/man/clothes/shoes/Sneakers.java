package man.clothes.shoes;

public class Sneakers implements IShoes {
    @Override
    public void dress() {
        System.out.println("Надеваю кроссовки");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю кроссовки");
    }
}
