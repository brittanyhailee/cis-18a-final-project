import java.util.Vector;

public class Cart {
    class Item {
        String product;
        double price;
        int quantity;
        Item(String product, double price, int quant) {
            this.product = product;
            this.price = price;
            this.quantity = quant;
        }
    }
    Vector<Item> cart;

    void addToCart(String product, double price, int quant) {
        Item i = new Item(product, price, quant);
        cart.add(i);
    }
}

