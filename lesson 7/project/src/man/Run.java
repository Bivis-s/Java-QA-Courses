package man;

import man.clothes.jackets.*;
import man.clothes.pants.*;
import man.clothes.shoes.*;

public class Run {
    public static void main(String[] args) {
        IJacket simpleJacket = new SimpleJacket();
        IJacket bomber = new Bomber();
        IPants simplePants = new SimplePants();
        IPants joggers = new Joggers();
        IShoes simpleShoes = new SimpleShoes();
        IShoes sneakers = new Sneakers();

        IMan man1 = new Man("Steve", simpleJacket, simplePants, simpleShoes);
        IMan man2 = new Man("Sam", bomber, joggers, sneakers);

        man1.dress();
        man1.undress();
        man2.dress();
        man2.undress();
    }
}
