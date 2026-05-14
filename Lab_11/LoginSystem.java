package Lab_11;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class LoginSystem extends JFrame implements ActionListener {
    JTextField t1, t2;
    JPasswordField t3;
    JRadioButton male, female;
    JCheckBox music, sports;
    JButton register, login, clear;
    Connection con;
    LoginSystem() {
        // Window
        setTitle("Login and Registration System");
        setSize(500, 500);
        setLayout(null);
        // Name
        JLabel l1 = new JLabel("Name");
        l1.setBounds(50, 50, 100, 30);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(180, 50, 200, 30);
        add(t1);
        // Username
        JLabel l2 = new JLabel("Username");
        l2.setBounds(50, 100, 100, 30);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(180, 100, 200, 30);
        add(t2);
        // Password
        JLabel l3 = new JLabel("Password");
        l3.setBounds(50, 150, 100, 30);
        add(l3);
        t3 = new JPasswordField();
        t3.setBounds(180, 150, 200, 30);
        add(t3);
        // Gender
        JLabel l4 = new JLabel("Gender");
        l4.setBounds(50, 200, 100, 30);
        add(l4);
        male = new JRadioButton("Male");
        male.setBounds(180, 200, 80, 30);
        female = new JRadioButton("Female");
        female.setBounds(280, 200, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(male);
        add(female);
        // Hobbies
        JLabel l5 = new JLabel("Hobbies");
        l5.setBounds(50, 250, 100, 30);
        add(l5);
        music = new JCheckBox("Music");
        music.setBounds(180, 250, 100, 30);
        sports = new JCheckBox("Sports");
        sports.setBounds(280, 250, 100, 30);
        add(music);
        add(sports);
        // Buttons
        register = new JButton("Register");
        register.setBounds(50, 350, 100, 40);
        login = new JButton("Login");
        login.setBounds(180, 350, 100, 40);
        clear = new JButton("Clear");
        clear.setBounds(310, 350, 100, 40);
        add(register);
        add(login);
        add(clear);
        // Events
        register.addActionListener(this);
        login.addActionListener(this);
        clear.addActionListener(this);
        // Database Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "annu",
                    ""
            );
            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String username = t2.getText();
        String password = new String(t3.getPassword());
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String hobbies = "";
        if (music.isSelected()) {
            hobbies += "Music ";
        }
        if (sports.isSelected()) {
            hobbies += "Sports";
        }
        // REGISTER
        if (e.getSource() == register) {
            try {
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO users VALUES (?, ?, ?, ?, ?)"
                );
                ps.setString(1, name);
                ps.setString(2, username);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.setString(5, hobbies);
                int x = ps.executeUpdate();
                if (x > 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "User Registered"
                    );
                }
            } catch (Exception ex) {

                System.out.println(ex);
            }
        }
        // LOGIN
        if (e.getSource() == login) {
            try {
                PreparedStatement ps = con.prepareStatement(
                        "SELECT * FROM users WHERE username=? AND password=?"
                );
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Login Successful"
                    );

                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid User"
                    );
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        // CLEAR
        if (e.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            male.setSelected(false);
            female.setSelected(false);
            music.setSelected(false);
            sports.setSelected(false);
        }
    }
    public static void main(String[] args) {
        new LoginSystem();
    }
}