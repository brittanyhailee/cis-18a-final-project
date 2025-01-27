import javax.swing.*;
import java.awt.*;
// import javax.swing.JPanel;
// import javax.swing.JFrame;
// import javax.swing.BorderFactory;

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

    public static void main(String[] args) {
        new GUI();

    }

}
