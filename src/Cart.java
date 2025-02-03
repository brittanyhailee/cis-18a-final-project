import java.util.Vector;

public class Cart {
    
    // class Item {
    //     String product;
    //     double price;
    //     int quantity;
    //     Item(String product, double price, int quant) {
    //         this.product = product;
    //         this.price = price;
    //         this.quantity = quant;
    //     }
    // }

    Vector<Product> inCart = new Vector<Product>();
    void addToCart(String product, float price, int quant) {
        Product p = new Product(product, quant, price);
        inCart.add(p);
    }
}

