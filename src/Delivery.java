import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Delivery {

    private JFrame jFrame1; 
    private JSeparator jSeparator1;
    private JDateChooser jDateChooser3;
    private JLabel jLabel1;
    private JButton jButton1;
    private String deliveryDate;
    public Boolean status;
    private String name;
    private Cart cart;

    public Delivery(String n, Cart c) {
        name = n;
        cart = c;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new JFrame("Delivery Date Setter");
        jLabel1 = new JLabel("Set Delivery Date");
        jButton1 = new JButton("Set Date");
        jDateChooser3 = new JDateChooser();
        
        // Set up the JFrame layout and components
        jFrame1.setLayout(null);
        jFrame1.setSize(400, 300); // Set the size of the JFrame

        jLabel1.setBounds(115, 31, 179, 35); // x, y, width, height
        jFrame1.add(jLabel1);

        jDateChooser3.setBounds(115, 75, 221, 36); // x, y, width, height
        jFrame1.add(jDateChooser3);

        jButton1.setBounds(148, 130, 111, 45); // x, y, width, height
        jFrame1.add(jButton1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        // Make sure the JFrame closes when clicked
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the JFrame
        jFrame1.setVisible(true);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        SimpleDateFormat f = new SimpleDateFormat("MMMM dd yyyy");
        Date d1 = null;
        
        try {
            Date date = jDateChooser3.getDate();
            deliveryDate = f.format(date);
            System.out.println("\nOrder for " + name);
            for (int j = 0; j < cart.inCart.size(); j++) {
                // System.out.printf("%20s", products[i].product);
    
                System.out.printf("%20s",cart.inCart.elementAt(j).product);
                System.out.print("\t‧₊˚❀༉\t");
                System.out.print("$"+cart.inCart.elementAt(j).price);
                System.out.println();
            }

            System.out.println("Delivery Date: " + deliveryDate);
            return;

        } catch(Exception e) {
            System.out.println("Please pick a valid date!");
            // e.printStackTrace();
        }
        return;
    } 

    public String returnDate() {
        return deliveryDate;
    }
    public Boolean status() {
        return status;
    }
}
     

 
// </editor-fold>         
    
    // Variables declaration - do not modify    

    // private javax.swing.JButton jButton1;
    // private com.toedter.calendar.JDateChooser jDateChooser1;
    // private com.toedter.calendar.JDateChooser jDateChooser2;
    // private com.toedter.calendar.JDateChooser jDateChooser3;
    // private javax.swing.JFrame jFrame1;
    // private javax.swing.JLabel jLabel1;
    // private javax.swing.JSeparator jSeparator1;

    // End of variables declaration         

