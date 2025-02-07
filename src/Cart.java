import java.util.Vector;

public class Cart {
    

    Vector<Product> inCart = new Vector<Product>();
    void addToCart(String product, float price, int quant) {
        Product p = new Product(product, quant, price);
        inCart.add(p);
    }
}

