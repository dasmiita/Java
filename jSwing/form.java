import javax.swing.*;
import java.awt.FlowLayout;
public class form{
    public static void main (String[] args){
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout()); //centrally aligned now
    
        JLabel L1 = new JLabel("USERNAME:"); //L1
        f.add(L1);
        JTextField t1 = new JTextField(20); //t2
        f.add(t1);

        JLabel L2 = new JLabel("PASSWORD:");
        f.add(L2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton b = new JButton("Submit");
        f.add(b);
        
    

    }
}