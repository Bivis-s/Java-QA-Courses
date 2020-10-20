package man.clothes.pants;

public class Joggers implements IPants {
    @Override
    public void dress() {
        System.out.println("Надеваю джоггеры");
    }

    @Override
    public void undress() {
        System.out.println("Снимаю джоггеры");
    }
}
