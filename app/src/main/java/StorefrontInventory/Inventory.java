package StorefrontInventory;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public void reduceQuantity(int itemId, int quantity) {
        if (isInStock(itemId)) {
            items.get(itemId).quantity -= quantity;
        } else {
            System.out.println("Not enough of this item in stock");
        }
    }
    public void restock(int itemId, int quantity) {
        items.get(itemId).quantity += quantity;
    }
    public void storeItem(Item item){
        items.add(item);
    }
    public int printItemId(Item item) {
       return items.indexOf(item);
    }

    public boolean isInStock(int itemId) {
        return (items.get(itemId).quantity > 0);
    }
}
// ArrayList<Type> variable_name = new ArrayList<Type>();