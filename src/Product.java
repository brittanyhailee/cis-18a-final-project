
public class Product {
    String product;
    float price;
    int quantity;

    Product(String n, float p) {
        this.product = n;
        this.price = p;
    }
    Product(String n, int q, float p) {
        product = n;
        quantity = q;
        price = p;
    }
}
