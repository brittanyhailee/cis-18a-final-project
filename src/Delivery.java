import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;

public class Delivery extends Checkout {

    private JFrame jFrame1; 
    private JDateChooser jDateChooser3;
    private JLabel jLabel1;
    private JButton jButton1;
    private String deliveryDate;
    private Date minDate = new Date(); // sets to current date
    private Date maxDate;

    public Delivery(String n, Cart c) {
        super.setName(n);
        super.setCart(c);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(minDate);
        calendar.add(Calendar.YEAR, 1);
        maxDate = calendar.getTime();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new JFrame("Delivery Date Setter");
        jLabel1 = new JLabel("Set Delivery Date");
        jButton1 = new JButton("Set Date");
        jDateChooser3 = new JDateChooser();
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
            super.checkOut(deliveryDate);

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
     

