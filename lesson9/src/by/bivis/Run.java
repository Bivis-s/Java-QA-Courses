package by.bivis;

import by.bivis.shop.Item;
import by.bivis.shop.Shop;

public class Run {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Dildo", 9.99);
        Item item2 = new Item(2, "Jopa", 19.99);
        Item item3 = new Item(3, "Dick", 3);
        Item item11 = new Item(1, "DildoDouble", 666.99);
        Shop shop = new Shop();

        System.out.println(shop.addItem(item1));
        System.out.println(shop.addItem(item2));
        System.out.println(shop.addItem(item3));
        System.out.println(shop.addItem(item11));

        System.out.println(shop.getAllItems());

        System.out.println(shop.removeItemById(3));
        System.out.println(shop.removeItemById(7));

        System.out.println(shop.replaceItem(item1));
    }
}
