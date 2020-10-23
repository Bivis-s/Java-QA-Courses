package man.clothes.jackets;

public class SimpleJacket implements IJacket{
    @Override
    public void dress() {
        System.out.println("Надеваю обычную куртку");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю обычную куртку");
    }
}
