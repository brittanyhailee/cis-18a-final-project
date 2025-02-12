
public class Product {
    String product;
    float price;
    int quantity;

    /* Method overloading */

    // This constructor is for products to add to the business inventory
    Product(String n, float p) {
        this.product = n;
        this.price = p;
    }

    // This constructor is for products to add to the cart because 
    // we need to set the quantity of how many of a certain product
    // the user wants to buy
    Product(String n, int q, float p) {
        product = n;
        quantity = q;
        price = p;
    }
}
