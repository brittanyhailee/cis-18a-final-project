
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.Event.*;

public class Checkout implements Payment, ActionListener {
    private String name;
    private Cart cart;
    private JPanel containerPanel = new JPanel();
    private JFrame jFrame = new JFrame("Checkout");

    public void setName(String n) {
        name = n;
    }

    public void setCart(Cart c) {
        cart = c;
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public float calculateTotal() {
        float deliveryFee = (float) 4.50;
        float tot = cart.calculateTotal() + deliveryFee;
        return tot;
    }

    public void checkOut(String date) {
        Vector<String> columns = new Vector<>();
        JPanel topPanel = new JPanel();
        // topPanel.setLayout(new GridLayout(2,1));
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS)); // Stack vertically
        JButton payment = new JButton("Proceed to Payment");
        
        payment.addActionListener(this);


        JLabel total = new JLabel(("❀༉Total: $" + cart.calculateTotal() + " ❀༉").toString());
        JLabel totalWithDelivery = new JLabel(("  +$4.50 Delivery Fee: $" + calculateTotal()).toString());

        columns.add("Product");
        columns.add("Quantity");
        columns.add("Price");

        String text = "𐙚 Order for " + getName() + " 𐙚";
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
            row.add((cart.inCart.elementAt(j).price) + " (x" + cart.inCart.elementAt(j).quantity + ")");

            tableData.add(row);
        }

        DefaultTableModel model = new DefaultTableModel(tableData, columns);
        // Create the table
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(350, 240));

        // Set containerPanel layout to BoxLayout (vertical)
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS)); // Stack components vertically
        containerPanel.add(scrollPane); // Add scrollPane with the table

        scrollPane.setMaximumSize(new Dimension(400, 230));
        scrollPane.setMinimumSize(new Dimension(400, 230));

        containerPanel.add(Box.createVerticalStrut(10));
        total.setAlignmentX(Component.CENTER_ALIGNMENT);
        containerPanel.add(total);

        containerPanel.add(Box.createVerticalStrut(10));
        totalWithDelivery.setAlignmentX(Component.CENTER_ALIGNMENT);
        containerPanel.add(totalWithDelivery);

        containerPanel.add(Box.createVerticalStrut(10)); // Add space between table and button
        payment.setAlignmentX(Component.CENTER_ALIGNMENT);
        containerPanel.add(payment); // Add Proceed to Payment button
        

        jFrame.add(topPanel, BorderLayout.NORTH);
        jFrame.add(containerPanel);
        jFrame.setSize(600, 430);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        JPanel paymentPanel = new JPanel();
        JFrame frm = new JFrame("Payment");
        JLabel amountLabel = new JLabel("Payment Amount: ");
        amountLabel.setFont(new Font("Calibri", Font.BOLD, 15));

        JLabel total = new JLabel("$" +calculateTotal());
        total.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

        total.setAlignmentX(Component.CENTER_ALIGNMENT);
        paymentPanel.add(amountLabel);
        paymentPanel.add(total);
        frm.add(paymentPanel);
        frm.setSize(400, 400);
        frm.setVisible(true);
        }
}
