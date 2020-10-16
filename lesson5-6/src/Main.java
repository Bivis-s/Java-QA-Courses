import animals.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Steve", 8, true, "instagram.com/cattycat");
        Animal dog = new Dog("Gordon", 4, 1);

        cat.info();
        cat.say();
        System.out.println();
        dog.info();
        dog.say();
    }
}
