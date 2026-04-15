import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public LoginFrame() {
        setTitle("User Authentication");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Set Fénix dark theme colors
        getContentPane().setBackground(new Color(34, 34, 34));
        UIManager.put("label.foreground", Color.white);
        UIManager.put("Button.background", new Color(59, 89, 152));
        UIManager.put("Button.foreground", Color.white);
        UIManager.put("TextField.background", new Color(51, 51, 51));
        UIManager.put("TextField.foreground", Color.white);
        UIManager.put("PasswordField.background", new Color(51, 51, 51));
        UIManager.put("PasswordField.foreground", Color.white);

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login logic here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Proceed with authentication...
                JOptionPane.showMessageDialog(LoginFrame.this, "Login logic not implemented yet.");
            }
        });

        // Setup layout
        setLayout(new GridLayout(3, 2));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Empty cell for layout
        add(loginButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}