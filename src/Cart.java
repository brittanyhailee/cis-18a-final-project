import java.util.Vector;

public class Cart implements Shopping, Payment{

    Vector<Product> inCart = new Vector<Product>();
    float total = 0;
    
    @Override
    public void addToCart(String product, float price, int quant) {
        Product p = new Product(product, quant, price);
        inCart.add(p);
    }

    @Override 
    public float calculateTotal() {
        total = 0;
        for (int j = 0; j < inCart.size(); j++) {
            total += (float)(inCart.elementAt(j).price * inCart.elementAt(j).quantity);

        }
        return total;
    }


}

