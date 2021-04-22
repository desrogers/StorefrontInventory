package StorefrontInventory;

public class Store {
    Item soap = new Item("new soap", 10.00);
    Item socks = new Item("socks", 4.00);
    Item shirt = new Item("shirt 1", 20.00);
    Inventory inventory;
    public Store() {
        this.inventory = new Inventory();
        inventory.storeItem(soap);
        inventory.storeItem(socks);
        inventory.storeItem(shirt);

        inventory.setQuantities(shirt, 5);
        inventory.setQuantities(socks, 5);
        inventory.setQuantities(soap, 2);

        int shirtQty = inventory.quantities.get(inventory.printItemId(shirt));

        System.out.println("shirt qty: " + shirtQty);
        Sales.purchase(inventory, shirt, 2);
        shirtQty = inventory.quantities.get(inventory.printItemId(shirt));
        System.out.println("shirt qty: " + shirtQty);

        inventory.restock(inventory.printItemId(shirt), 5);
        shirtQty = inventory.quantities.get(inventory.printItemId(shirt));
        System.out.println("restock shirt qty: " + shirtQty);
    }
}
