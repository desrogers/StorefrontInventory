package StorefrontInventory;

public class Item {
    public String name;
    public Double price;
    public int quantity;

    public Item(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
