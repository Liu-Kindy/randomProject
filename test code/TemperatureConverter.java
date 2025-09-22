import javax.swing.*;

public class TemperatureConverter {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Temperature Converter");

      JPanel panel = new JPanel();

      JLabel label1 = new JLabel("Enter temperature in Celsius:");
      JTextField celsiusField = new JTextField(10);

      JLabel label2 = new JLabel("Temperature in Fahrenheit:");
      JTextField fahrenheitField = new JTextField(10);
      fahrenheitField.setEditable(false);

      JButton convertButton = new JButton("Convert");
      convertButton.addActionListener(e -> {
         double celsius = Double.parseDouble(celsiusField.getText());
         double fahrenheit = (celsius * 1.8) + 32;
         fahrenheitField.setText(String.format("%.2f", fahrenheit));
      });

      panel.add(label1);
      panel.add(celsiusField);
      panel.add(label2);
      panel.add(fahrenheitField);
      panel.add(convertButton);

      frame.add(panel);

      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}