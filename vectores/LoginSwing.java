package vectores;

import javax.swing.*;
import java.awt.event.*;

public class LoginSwing extends JFrame implements ActionListener {
    private JTextField user;
    private JTextField pass;
    private JButton boton;

    public LoginSwing() {
        setLayout(null);

        user = new JTextField();
        user.setBounds(50, 30, 150, 20);
        add(user);

        pass = new JTextField();
        pass.setBounds(50, 60, 150, 20);
        add(pass);

        boton = new JButton("Login");
        boton.setBounds(50, 100, 100, 30);
        add(boton);

        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (user.getText().equals("juan") && pass.getText().equals("abc123"))
            setTitle("Correcto");
        else
            setTitle("Incorrecto");
    }

    public static void main(String[] args) {
        LoginSwing l = new LoginSwing();
        l.setBounds(0, 0, 300, 200);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
