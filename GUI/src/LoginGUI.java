import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {

    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JLabel success;




    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Simple Login GUI ");
         frame.setSize(350,200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(panel);
         frame.setLocationRelativeTo(null);

         panel.setLayout(null);

        JLabel userLabel = new JLabel("Username");
         userLabel.setBounds(10,20,80,25); // Boundaries of User label
         panel.add(userLabel);

         userText = new JTextField(20);
         userText.setBounds(100,20,165,25);
         panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
         passwordLabel.setBounds(10,60,80,25);
         panel.add(passwordLabel);

         passwordText = new JPasswordField(20);
         passwordText.setBounds(100,60,165,25);
         panel.add(passwordText);

        JButton button = new JButton("Login");
         button.setBounds(10,100,70,20);
         button.addActionListener(new LoginGUI());
         panel.add(button);

         success = new JLabel("");
         success.setBounds(100,95,300,25);  // This JLabel shows the output of the Login Button
        success.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
         panel.add(success);


         frame.setVisible(true);

    }

 @Override
 public void actionPerformed(ActionEvent e) {
     String user = userText.getText();
     String password = passwordText.getText();
  if(user.equals("Sai Krishna") && password.equals("1212"))
   success.setText(" 'Login Successfully..!' ");
  else
   success.setText("Login Decline");
 }
}
