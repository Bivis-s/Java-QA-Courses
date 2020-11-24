package by.bivis;

import by.bivis.shop.Item;
import by.bivis.shop.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    Shop shop;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Boolean condition = false;

    public Application(Shop shop) {
        this.shop = shop;
    }

    public void start() {
        condition = true;
        while (condition) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1 - Вывод всех товаров");
            System.out.println("2 - Добавление товара");
            System.out.println("3 - Удаление товара");
            System.out.println("4 - Редактирование товара");
            System.out.println("5 - выход");
            System.out.println();
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 1) {
                showAllItems();
            } else if (num == 2) {
                addItem();
            } else if (num == 3) {
                removeItem();
            } else if (num == 4) {
                editItem();
            } else if (num == 5) {
                exit();
            } else {
                System.out.println("Вы ввели неверное число");
            }
        }
    }

    private Item createItemFromScanner() {
        System.out.print("Введите id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите название: ");
        String name = scanner.nextLine();
        System.out.print("Введите цену: ");
        double price = Double.parseDouble(scanner.nextLine());

        return new Item(id, name, price);
    }

    private List<Item> sortByPriceMinMax(List<Item> itemList) {
        List<Item> newItemList = new ArrayList<>(List.copyOf(itemList)); // копируем список чтобы не изменять изначальный
        List<Item> sortedList = new ArrayList<>();
        while (newItemList.size() > 0) {
            Item minCostItem = newItemList.get(0);
            for (Item item : newItemList) {
                if (item.getPrice() < minCostItem.getPrice()) {
                    minCostItem = item;
                }
            }
            sortedList.add(minCostItem);
            newItemList.remove(minCostItem);
        }
        return sortedList;
    }

    private List<Item> sortByPriceMaxMin(List<Item> itemList) {
        List<Item> newItemList = new ArrayList<>(List.copyOf(itemList)); // копируем список чтобы не изменять изначальный
        List<Item> sortedList = new ArrayList<>();
        while (newItemList.size() > 0) {
            Item maxCostItem = newItemList.get(0);
            for (Item item : newItemList) {
                if (item.getPrice() > maxCostItem.getPrice()) {
                    maxCostItem = item;
                }
            }
            sortedList.add(maxCostItem);
            newItemList.remove(maxCostItem);
        }
        return sortedList;
    }

    private List<Item> sortByAdding(List<Item> itemList) {
        List<Item> sortedList = new ArrayList<>();
        for (int i = itemList.size() - 1; i >= 0; i--) {
            sortedList.add(itemList.get(i));
        }
        return sortedList;
    }

    private void printList(List<Item> itemList) {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    private void showAllItems() {
        System.out.println("Выберите сортировку:");
        System.out.println("1 - по цене(возрастание)");
        System.out.println("2 - по цене(убывание)");
        System.out.println("3 - по добавлению");
        int num = Integer.parseInt(scanner.nextLine());
        List<Item> itemList = shop.getItemsList();

        if (num == 1) {
            printList(sortByPriceMinMax(itemList));
        } else if (num == 2) {
            printList(sortByPriceMaxMin(itemList));
        } else if (num == 3) {
            printList(sortByAdding(itemList));
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }

    private boolean addItem() {
        Item item = createItemFromScanner();

        if (shop.addItem(item)) {
            System.out.println("Товар успешно добавлен!");
            return true;
        } else {
            System.out.println("Товар с таким id уже есть!");
            return false;
        }
    }

    private boolean removeItem() {
        System.out.println("Введите id:");
        int id = Integer.parseInt(scanner.nextLine());

        if(shop.removeItemById(id)) {
            System.out.println("Товар успешно удалён!");
            return true;
        } else {
            System.out.println("Товара с таким id нет!");
            return false;
        }
    }

    private boolean editItem() {
        Item item = createItemFromScanner();

        if(shop.replaceItem(item)) {
            System.out.println("Товар успешно редактирован!");
            return true;
        } else {
            System.out.println("Товара с таким id нет!");
            return false;
        }
    }

    private void exit() {
        condition = false;
    }
}
