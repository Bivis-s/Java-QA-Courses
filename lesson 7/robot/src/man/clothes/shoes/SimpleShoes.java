package man.clothes.shoes;

public class SimpleShoes implements IShoes {
    @Override
    public void dress() {
        System.out.println("Надеваю обычную обувь");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю обычную обувь");
    }
}
