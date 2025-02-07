
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkout  {
    private String name;
    private Cart cart;
    private JPanel containerPanel;
    private JFrame jFrame; 

    public void setName(String n) {
        name = n;
    }
    
    public void setCart(Cart c) {
        cart = c;
    }

    public String getName() { return name; }
    public Cart getCart() { return cart; }

    public void checkOut() {
        jFrame = new JFrame("Checkout");
        jFrame.setLayout(null);
        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }   
}
