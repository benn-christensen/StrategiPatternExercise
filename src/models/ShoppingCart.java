package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private String paymentMethod;

    public ShoppingCart(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void pay() {
        if (paymentMethod.equals("Kontant")) {
            System.out.println("Kontant betalt: " + getTotalPrice());
        } else if (paymentMethod.equals("Kort")) {
            System.out.println("Kort betalt: " + getTotalPrice());
        } else {
            System.out.println("Ugyldig betalingsmetode");
        }
    }
}
