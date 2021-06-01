package Car;

import javax.swing.*;

public class CarDemo {
    private JPanel mianPanel;
    private JPanel northPanel;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mianPanel);
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
