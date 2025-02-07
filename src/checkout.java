
public class checkout  {
    private String name;
    private Cart cart;

    public void setName(String n) {
        name = n;
    }
    
    public void setCart(Cart c) {
        cart = c;
    }

    public String getName() { return name; }
    public Cart getCart() { return cart; }
}
