package StorefrontInventory;

import java.util.ArrayList;

public class Sales {
    public static void purchase(Inventory inventory, Item item, int quantity) {
        int itemId = inventory.printItemId(item);
        inventory.reduceQuantity(itemId, quantity);
    }
}
