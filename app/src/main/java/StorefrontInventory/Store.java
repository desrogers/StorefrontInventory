package StorefrontInventory;

public class Store {
    Item soap = new Item("new soap", 10.00, 5);
    Item socks = new Item("socks", 4.00, 5);
    Item shirt = new Item("shirt 1", 20.00, 2);
    Inventory inventory;
    public Store() {
        this.inventory = new Inventory();
        inventory.storeItem(soap);
        inventory.storeItem(socks);
        inventory.storeItem(shirt);

        System.out.println("shirt qty: " + shirt.quantity);
        Sales.purchase(inventory, shirt, 2);
        System.out.println("shirt qty: " + shirt.quantity);

        inventory.restock(inventory.printItemId(shirt), 5);
        System.out.println("restock shirt qty: " + shirt.quantity);
    }
}
