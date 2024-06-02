import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField resultField;
    private JButton calculateButton;

    public Task_1() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // зміна закриття вікна
        setBounds(100, 100, 400, 300);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel label1 = new JLabel("Вхідні дані 1:");
        label1.setBounds(30, 30, 100, 20);
        contentPane.add(label1);

        inputField1 = new JTextField();
        inputField1.setBounds(150, 30, 150, 20);
        contentPane.add(inputField1);

        JLabel label2 = new JLabel("Вхідні дані 2:");
        label2.setBounds(30, 60, 100, 20);
        contentPane.add(label2);

        inputField2 = new JTextField();
        inputField2.setBounds(150, 60, 150, 20);
        contentPane.add(inputField2);

        JLabel resultLabel = new JLabel("Результат:");
        resultLabel.setBounds(30, 90, 100, 20);
        contentPane.add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(150, 90, 150, 20);
        resultField.setEditable(false);
        contentPane.add(resultField);

        calculateButton = new JButton("Обчислити");
        calculateButton.setBounds(150, 120, 100, 30);
        contentPane.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        try {
            double value1 = Double.parseDouble(inputField1.getText());
            double value2 = Double.parseDouble(inputField2.getText());
            double result = value1 + value2; // Зміна обчислення за потребою
            resultField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Будь ласка, введіть коректні числа.");
        }
    }

    public static void Task() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Task_1 frame = new Task_1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
