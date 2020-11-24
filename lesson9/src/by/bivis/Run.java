package by.bivis;

import by.bivis.shop.Item;
import by.bivis.shop.Shop;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Application application = new Application(shop);
        application.start();
    }
}
