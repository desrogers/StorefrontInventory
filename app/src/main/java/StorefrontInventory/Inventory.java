package StorefrontInventory;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();
    HashMap<Integer, Integer> quantities = new HashMap<Integer, Integer>();

    public void reduceQuantity(int itemId, int quantity) {
        if (isInStock(itemId)) {
            int qty = quantities.get(itemId);
            int newQty = qty - quantity;
            quantities.put(itemId, newQty);
        } else {
            System.out.println("Not enough of this item in stock");
        }
    }
    public void restock(int itemId, int quantity) {
        int qty = quantities.get(itemId);
        int newQty = qty + quantity;
    quantities.put(itemId, newQty);
    }
    public void storeItem(Item item){
        items.add(item);
    }
    public int printItemId(Item item) {
       return items.indexOf(item);
    }

    public boolean isInStock(int itemId) {
        return (quantities.get(itemId) > 0);
    }

    public void setQuantities(Item item, int quantity) {
        int itemId = this.printItemId(item);
        quantities.put(itemId, quantity);
    }
}
// ArrayList<Type> variable_name = new ArrayList<Type>();
// HashMap<Type-key, Type-value> variable_name = new HashMap<>();