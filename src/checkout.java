
import javax.swing.*;
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

        columns.add("Product");
        columns.add("Quantity");
        columns.add("Price");

        String text = "𐙚 Order for " + getName() +" 𐙚";
        JLabel name = new JLabel(text);
        JLabel delivery = new JLabel("Delivery: " + date);

        containerPanel.add(name);
        containerPanel.add(delivery);
        
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
 
         containerPanel.add(scrollPane);

         // Add the scroll pane to the frame
        //  jFrame.add(scrollPane);

        // for (int j = 0; j < cart.inCart.size(); j++) {
        //     System.out.printf("%20s", cart.inCart.elementAt(j).product);
        //     JLabel prod = new JLabel(cart.inCart.elementAt(j).product + "\t‧₊˚❀༉\t" + "$"+ cart.inCart.elementAt(j).price);
        //     // System.out.print("\t‧₊˚❀༉\t");
        //     // System.out.print("$"+ cart.inCart.elementAt(j).price);
        //     containerPanel.add(prod);
        // }

        

        jFrame.add(containerPanel, BorderLayout.NORTH);
        jFrame.setSize(600, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       

        jFrame.setVisible(true);


    }   
}
