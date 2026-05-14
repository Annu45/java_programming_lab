//Advanced version of awt
package Lab_11;
import javax.swing.*;
import java.awt.event.*;
public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Example");
        JCheckBox cb = new JCheckBox("Accept Terms");
        cb.setBounds(100, 100, 150, 30);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cb.isSelected()) {
                    JOptionPane.showMessageDialog(f,
                            "Terms Accepted");
                }
            }
        });
        f.add(cb);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}