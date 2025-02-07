
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkout  {
    private String name;
    private Cart cart;
    private JPanel containerPanel = new JPanel();
    private JFrame jFrame; 
    private JLabel customerCart;

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
        String text = "𐙚 Order for " + getName() +" 𐙚";
       

        jFrame.add(containerPanel, BorderLayout.NORTH);
        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel(text);
        containerPanel.add(title);

        jFrame.setVisible(true);


    }   
}
