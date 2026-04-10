import javax.swing.*;
import java.awt.event.*;

public class FormularioUsuario extends JFrame implements ActionListener {
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;

    public FormularioUsuario() {
        setLayout(null);

        label1 = new JLabel("Usuario:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(120, 10, 150, 20);
        add(textfield1);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);

        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cad = textfield1.getText();
            setTitle(cad);
        }
    }

    public static void main(String[] ar) {
        FormularioUsuario f = new FormularioUsuario();
        f.setBounds(0, 0, 350, 170);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}