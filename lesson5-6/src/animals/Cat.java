package animals;

public class Cat extends  Animal{
    protected boolean predator;
    protected String inst;

    public Cat(String name, int age, boolean predator, String inst) {
        super(name, age);
        this.predator = predator;
        this.inst = inst;
    }

    @Override
    public void info() {
        super.info();
        if (predator) {
            System.out.println("It's can catch mouse");
        } else {
            System.out.println("It's can't catch mouse");
        }
        System.out.println("Instagram page: " + inst);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }

}
