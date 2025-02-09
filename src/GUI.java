/* This is a business program selling matcha
 * GUI.java contains the main() program.
 * To run the program, select 'Run and Debug' on VSCode or other IDEs 
 */
import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        JLabel title = new JLabel("Little Miss Matcha");
        panel.add(title);

        frame.setSize(500, 600);
        frame.add(panel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Little Miss Matcha");
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args) throws java.io.IOException {
        // new GUI();
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);
        c.initView();

    }

}
