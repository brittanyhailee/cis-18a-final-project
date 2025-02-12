import java.util.Vector;

public class Cart implements Shopping, Payment{

    /* inCart is the cart of the user and it is the vector so user 
      can add as much items as they want into the cart. */
    Vector<Product> inCart = new Vector<Product>();
    float total = 0;
    
    // Cart implementing the abstract method from Shopping interface
    @Override
    public void addToCart(String product, float price, int quant) {
        Product p = new Product(product, quant, price); // Create a product object
        inCart.add(p); // Add the product object into the user's inCart object
    }

    // Cart implementing the abstrat method from Payment interface
    @Override 
    public float calculateTotal() {
        total = 0;
        for (int j = 0; j < inCart.size(); j++) {
            // Use addition assignment operator to get the price of the product 
            // multiplied by its quantity and add it to the total price of products
            // in the user's cart
            total += (float)(inCart.elementAt(j).price * inCart.elementAt(j).quantity);

        }
        return total;
    }


}

