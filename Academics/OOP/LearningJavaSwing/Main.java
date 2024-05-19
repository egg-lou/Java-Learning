import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public Main() {
        setTitle("Main");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.BLACK);

        JTextField txt = new JTextField();
        add(txt);
        txt.setBounds(50, 100, 200, 50);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txt.setForeground(Color.PINK);
        txt.addActionListener(e -> {
            String text = txt.getText();
            System.out.println(text);
        });

        JButton btn = new JButton("Click");
        add(btn);
        btn.setBounds(50, 150, 200, 30);
        btn.addActionListener(e -> {
            String text = txt.getText();
            System.out.println(text);

            JOptionPane.showMessageDialog(null, "Welcome " + text, "Welcome Message",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}