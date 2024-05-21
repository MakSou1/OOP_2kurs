import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Створення фрейму
        JFrame frame = new JFrame("Обчислення нормального прискорення");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));

        // Створення елементів інтерфейсу
        JLabel radiusLabel = new JLabel("Введіть радіус (R):");
        JTextField radiusField = new JTextField();
        JLabel speedLabel = new JLabel("Введіть лінійну швидкість (V):");
        JTextField speedField = new JTextField();
        JButton calculateButton = new JButton("Обчислити");
        JLabel resultLabel = new JLabel("Нормальне прискорення:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Додавання елементів до фрейму
        frame.add(radiusLabel);
        frame.add(radiusField);
        frame.add(speedLabel);
        frame.add(speedField);
        frame.add(calculateButton);
        frame.add(resultLabel);
        frame.add(resultField);

        // Обробка натискання кнопки
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double R = Double.parseDouble(radiusField.getText());
                    double V = Double.parseDouble(speedField.getText());
                    double normalAcceleration = (V * V) / R;
                    resultField.setText(String.format("%.2f", normalAcceleration));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Будь ласка, введіть коректні числові значення.", "Помилка вводу", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Відображення фрейму
        frame.setVisible(true);
    }
}