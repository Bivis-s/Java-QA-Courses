package man;

import man.clothes.jackets.IJacket;
import man.clothes.pants.IPants;
import man.clothes.shoes.IShoes;

public class Man implements IMan{
    String name;
    IJacket jacket;
    IPants pants;
    IShoes shoes;

    public Man(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void dress() {
        jacket.dress();
        pants.dress();
        shoes.dress();
    }

    @Override
    public void undress() {
        jacket.undress();
        pants.undress();
        shoes.undress();
    }
}
