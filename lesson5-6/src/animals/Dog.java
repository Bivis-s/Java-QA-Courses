package animals;

public class Dog extends Animal{
    int commands;

    public Dog(String name, int age, int commands) {
        super(name, age);
        this.commands = commands;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Count of commands: " + commands);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
