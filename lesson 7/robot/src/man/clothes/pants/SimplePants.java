package man.clothes.pants;

public class SimplePants implements IPants{
    @Override
    public void dress() {
        System.out.println("Надеваю обычные штаны");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю обычные штаны");
    }
}
