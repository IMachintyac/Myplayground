import javax.swing.*;
class Swing{
    Swing(){
        JFrame win;
        JLabel l1,l2;
        JTextField tf1,tf2;
    l1=new JLabel("Enter Number 1");
    l1.setBounds(200,14,200,200);

    tf1=new JTextField();
    tf1.setBounds(200,32,80,20);

    l2=new JLabel("Enter Number 2");
    l2.setBounds(200,45,200,200);
    tf2=new JTextField();
    tf2.setBounds(200, 55, 80,20);
    
    tf2=new JTextField();

        win=new JFrame("Window");
        win.add(l1);
        win.add(tf1);
        win.add(l2);
        win.add(tf2);
        win.setSize(500, 500);
        win.setLayout(null);
        win.setVisible(true);

        
    }
}
class Demo{
    public static void main(String[] args) {
        Swing obj=new Swing();
    }
}
