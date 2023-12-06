import javax.swing.*;
import java.awt.*;

class Swing {
    JFrame win;
    JLabel l1;
    JButton b1;
    JTextField tf1;

    Swing() {
        win = new JFrame();
        win.setTitle("Window");
        ImageIcon image = new ImageIcon("eagle.jpg"); // Make sure the file path is correct
        win.setIconImage(image.getImage());

        l1 = new JLabel();
        l1.setText("Hello, I am A Label");
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.TOP);

        tf1 = new JTextField(20); // Set the preferred width

        b1=new JButton();
        b1.setText("Submit");
        b1.setBounds(90,90,20,);

        // Set layout manager (FlowLayout with vertical alignment)
        win.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        win.add(l1);
        win.add(tf1);

        win.setSize(500, 500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
    public static void main(String[] args) {
        Swing sw= new Swing();
    }
}
