import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_2 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField volumeField;
    private JTextField heightField;
    private JTextField energyField;
    private JButton calculateButton;
    private static final double DENSITY = 1000; // Густина води кг/м³
    private static final double GRAVITY = 9.8; // Прискорення вільного падіння м/с²

    public Task_2() {
        setTitle("Інверсний калькулятор");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // зміна закриття вікна
        setBounds(100, 100, 400, 300);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel volumeLabel = new JLabel("Об'єм (V) в м³:");
        volumeLabel.setBounds(30, 30, 120, 20);
        contentPane.add(volumeLabel);

        volumeField = new JTextField();
        volumeField.setBounds(150, 30, 150, 20);
        contentPane.add(volumeField);

        JLabel heightLabel = new JLabel("Висота (h) в м:");
        heightLabel.setBounds(30, 60, 120, 20);
        contentPane.add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(150, 60, 150, 20);
        contentPane.add(heightField);

        JLabel energyLabel = new JLabel("Енергія (W) в Дж:");
        energyLabel.setBounds(30, 90, 120, 20);
        contentPane.add(energyLabel);

        energyField = new JTextField();
        energyField.setBounds(150, 90, 150, 20);
        contentPane.add(energyField);

        calculateButton = new JButton("Обчислити");
        calculateButton.setBounds(150, 120, 100, 30);
        contentPane.add(calculateButton);

        volumeField.addActionListener(e -> updateFields());
        heightField.addActionListener(e -> updateFields());
        energyField.addActionListener(e -> updateFields());

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void updateFields() {
        boolean volumeFilled = !volumeField.getText().isEmpty();
        boolean heightFilled = !heightField.getText().isEmpty();
        boolean energyFilled = !energyField.getText().isEmpty();

        volumeField.setEditable(!volumeFilled || !heightFilled);
        heightField.setEditable(!heightFilled || !energyFilled);
        energyField.setEditable(!energyFilled || !volumeFilled);
    }

    private void calculate() {
        try {
            boolean volumeFilled = !volumeField.getText().isEmpty();
            boolean heightFilled = !heightField.getText().isEmpty();
            boolean energyFilled = !energyField.getText().isEmpty();

            if (volumeFilled && heightFilled) {
                double volume = Double.parseDouble(volumeField.getText());
                double height = Double.parseDouble(heightField.getText());
                double energy = DENSITY * volume * GRAVITY * height;
                energyField.setText(String.format("%.2f", energy));
            } else if (volumeFilled && energyFilled) {
                double volume = Double.parseDouble(volumeField.getText());
                double energy = Double.parseDouble(energyField.getText());
                double height = energy / (DENSITY * volume * GRAVITY);
                heightField.setText(String.format("%.2f", height));
            } else if (heightFilled && energyFilled) {
                double height = Double.parseDouble(heightField.getText());
                double energy = Double.parseDouble(energyField.getText());
                double volume = energy / (DENSITY * GRAVITY * height);
                volumeField.setText(String.format("%.2f", volume));
            } else {
                JOptionPane.showMessageDialog(this, "Будь ласка, введіть дані у два поля.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Будь ласка, введіть коректні числа.");
        }
    }

    public static void Task() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Task_2 frame = new Task_2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
