import models.Item;
import models.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("Kontant");
        Item item1 = new Item("Mælk", 10);
        Item item2 = new Item("Sukker", 20);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay();
        cart = new ShoppingCart("kort");
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay();
    }
}
