
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class Checkout  {
    private String name;
    private Cart cart;
    private JPanel containerPanel = new JPanel();
    private JFrame  jFrame = new JFrame("Checkout");
    private JLabel customerCart;

    public void setName(String n) {
        name = n;
    }
    
    public void setCart(Cart c) {
        cart = c;
    }

    public String getName() { return name; }
    public Cart getCart() { return cart; }

    public void checkOut(String date) {
        Vector<String> columns = new Vector<>();
        JPanel topPanel = new JPanel();
        // topPanel.setLayout(new GridLayout(2,1));
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS)); // Stack vertically
        JButton payment = new JButton("Proceed to Payment");

     
        columns.add("Product");
        columns.add("Quantity");
        columns.add("Price");

        String text = "𐙚 Order for " + getName() +" 𐙚";
        JLabel name = new JLabel(text);
        JLabel delivery = new JLabel("Delivery: " + date);

        name.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the name label
        delivery.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the delivery label


        topPanel.add(Box.createVerticalStrut(10)); // Add space before the name label (optional)
        topPanel.add(name);

        topPanel.add(Box.createVerticalStrut(10)); // Add space before the name delivery (optional)
        topPanel.add(delivery);
        topPanel.add(Box.createVerticalStrut(10)); // Add space after the delivery label (optional)

        Vector<Vector<Object>> tableData = new Vector<>();

        for (int j = 0; j < cart.inCart.size(); j++) {
            Vector<Object> row = new Vector<>();
            row.add(cart.inCart.elementAt(j).product);
            row.add(cart.inCart.elementAt(j).quantity);
            row.add((cart.inCart.elementAt(j).price) + " (x" + cart.inCart.elementAt(j).quantity +")");
            
            tableData.add(row);
        }
        

        DefaultTableModel model = new DefaultTableModel(tableData, columns);
         // Create the table
        JTable table = new JTable(model);

         // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(350, 240));


        // Set containerPanel layout to BoxLayout (vertical)
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));  // Stack components vertically
        containerPanel.add(scrollPane); // Add scrollPane with the table

        scrollPane.setMaximumSize(new Dimension(400, 260));
        scrollPane.setMinimumSize(new Dimension(350, 240));

        containerPanel.add(Box.createVerticalStrut(10));  // Add space between table and button
        payment.setAlignmentX(Component.CENTER_ALIGNMENT); 
        containerPanel.add(payment); // Add Proceed to Payment button

        jFrame.add(topPanel, BorderLayout.NORTH);        
        jFrame.add(containerPanel);
        jFrame.setSize(600, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }   
}
