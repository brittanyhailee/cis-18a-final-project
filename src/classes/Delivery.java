package classes;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;

public class Delivery extends Checkout {

    // Create instance variables for Java Swing such as frame, date chooser, label, and button
    private JFrame jFrame1; 
    private JDateChooser jDateChooser3;
    private JLabel jLabel1;
    private JButton jButton1;
    private String deliveryDate;

    // These Date variables are to calculate the minimum and maximum
    // delivery date that the user can pick
    private Date minDate = new Date(); // Sets to current date
    private Date maxDate;


    public Delivery(String n, Cart c) {
        // Pass arguments required for super constructor 
        super.setName(n);
        super.setCart(c);

        // Create calendar instance 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(minDate);
        calendar.add(Calendar.YEAR, 1); // Add 1 year to the minimum date and this gives the max
                                            // date that the customer can schedule their delivery
        maxDate = calendar.getTime();
        initComponents(); // Initialize the Java Swing GUI
    }
                  
    private void initComponents() {

        jFrame1 = new JFrame("Delivery Date Setter");
        jLabel1 = new JLabel("Set Delivery Date");
        jButton1 = new JButton("Set Date");
        jDateChooser3 = new JDateChooser();

        // Set the minimum and maximum selectable date of the JDateChooser 
        jDateChooser3.setMinSelectableDate(minDate);
        jDateChooser3.setMaxSelectableDate(maxDate);

        // Set up the JFrame layout and components
        jFrame1.setLayout(null);
        jFrame1.setSize(600, 430); // Set the size of the JFrame

        jLabel1.setBounds(230, 60, 179, 35); // x, y, width, height
        jFrame1.add(jLabel1);

        jDateChooser3.setBounds(205, 105, 221, 36); // x, y, width, height
        jFrame1.add(jDateChooser3);


        jButton1.setBounds(240, 160, 111, 45); // x, y, width, height
        jFrame1.add(jButton1);
        // Add action listener to the button which sets the user's selected delivery date
        // and will lead the user to the checkout window
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
        // Properly format the date                                  
        SimpleDateFormat f = new SimpleDateFormat("MMMM dd yyyy");
        
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
            super.checkOut(deliveryDate); // Calls the checkout window
            jFrame1.dispose();

            return;

        } catch(Exception e) {
            // In case the user attempts to pass an empty date
            System.out.println("Please pick a valid date!");
        }
        return;
    } 

    public String returnDate() {
        return deliveryDate;
    }

}
     

