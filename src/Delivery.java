import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Delivery extends Checkout {

    private JFrame jFrame1; 
    private JSeparator jSeparator1;
    private JDateChooser jDateChooser3;
    private JLabel jLabel1;
    private JButton jButton1;
    private String deliveryDate;

    public Delivery(String n, Cart c) {
        super.setName(n);
        super.setCart(c);
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
            System.out.printf("%10s", "\n\t𐙚 Order for " + super.getName() +" 𐙚\n");
            for (int j = 0; j < super.getCart().inCart.size(); j++) {
                System.out.printf("%20s", super.getCart().inCart.elementAt(j).product);
                System.out.print("\t‧₊˚❀༉\t");
                System.out.print("$"+ super.getCart().inCart.elementAt(j).price);
                System.out.println();
            }

            System.out.println("Delivery Date: " + deliveryDate);
            super.checkOut();
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

}
     

