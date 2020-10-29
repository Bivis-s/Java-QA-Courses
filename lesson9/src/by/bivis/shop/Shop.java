package by.bivis.shop;

import java.util.*;

public class Shop {
    private List<Item> itemsList = new ArrayList<>();

    private boolean containsItemId(Item item) {  // Проверяет, содержится ли товар с таким id в списке
        for (Item i : itemsList) {
            if (i.getId() == item.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addItem(Item item) {  // Добавляет товар в список, если в нём нет товара с таким же id
        if (!containsItemId(item)) {
            itemsList.add(item);
            return true;
        } else {
            return false;
        }
    }

    public List getAllItems() {
        return itemsList;
    }

    public boolean removeItemById(int id) {  // Итерируется по списку и удаляет товар с заданным id, если он есть
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getId() == id) {
                itemsList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean replaceItem(Item item) {
        if (itemsList.contains(item)) {
            itemsList.set(itemsList.indexOf(item), item);
            return true;
        }
        return false;
    }
}
