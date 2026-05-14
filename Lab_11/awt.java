/*abstract window toolkit It is Java’s old GUI library used to create:
* Window
* Button
* Checkbox
* TextField
* Dialog Box
AWT components depend on operating system.*/
package Lab_11;
import java.awt.*;
import java.awt.event.*;
public class awt {
    public static void main(String[] args) {

        Frame f = new Frame("AWT Example");//window banata h ye

        Checkbox cb = new Checkbox("Accept Terms");
        cb.setBounds(100, 100, 150, 30);
        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cb.getState()) {
                    Dialog d = new Dialog(f, "Message", true);
                    d.setLayout(new FlowLayout());  //Components arranged left to right.
                    d.add(new Label("Terms Accepted"));
                    Button b = new Button("OK");
                    b.addActionListener(a -> d.dispose());   //dispose()close window.
                    d.add(b);
                    d.setSize(200, 100);
                    d.setVisible(true);  //Makes dialog visible.
                }
            }
        });
        f.add(cb);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { //Handles close button event.
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}