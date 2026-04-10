import javax.swing.*;

public class FormularioHolaMundo extends JFrame {
    private JLabel label1;

    public FormularioHolaMundo() {
        setLayout(null);
        label1 = new JLabel("Hola Mundo.");
        label1.setBounds(10, 20, 200, 30);
        add(label1);
    }

    public static void main(String[] ar) {
        FormularioHolaMundo f = new FormularioHolaMundo();
        f.setBounds(10, 10, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}