package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ejer1 extends JFrame {
private JPanel contentPane;
private JTextField txtDisplay;
private int firstNumber;
private int secondNumber;
private String operator;
public static void main(String[] args) {
	UIManager.put("OptionPane.background", new Color(139, 0, 139));
UIManager.put("Panel.background", new Color(139, 0, 139));
UIManager.put("Button.background", new Color(0, 0, 0));
UIManager.put("Button.foreground", new Color(255,255,255));
UIManager.put("OptionPane.messageForeground", Color.white);
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	ejer1 frame = new ejer1();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public ejer1() {
setTitle("Calculadora-numeros naturales");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 400, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(139, 0, 139));
setContentPane(contentPane);
contentPane.setLayout(null);
txtDisplay = new JTextField();
txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
txtDisplay.setBounds(10, 11, 282, 40);
contentPane.add(txtDisplay);
txtDisplay.setColumns(10);
JButton btnSuma = new JButton("Suma");
btnSuma.setForeground(new Color(255, 255, 255));
btnSuma.setBackground(new Color(0, 0, 0));
btnSuma.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setOperator("+");
askNumbers();
}
});
btnSuma.setBounds(10, 62, 181, 40);
contentPane.add(btnSuma);
JButton btnResta = new JButton("Resta");
btnResta.setForeground(new Color(255, 255, 255));
btnResta.setBackground(new Color(0, 0, 0));
btnResta.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setOperator("-");
askNumbers();
}
});
btnResta.setBounds(211, 92, 163 , 40);
contentPane.add(btnResta);
JButton btnMultiplicacion = new JButton("Multiplicación");
btnMultiplicacion.setForeground(new Color(255, 255, 255));
btnMultiplicacion.setBackground(new Color(0, 0, 0));
btnMultiplicacion.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setOperator("*");
askNumbers();
}
});
btnMultiplicacion.setBounds(10, 159, 181, 40);
contentPane.add(btnMultiplicacion);
JButton btnDivision = new JButton("División");
btnDivision.setForeground(new Color(255, 255, 255));
btnDivision.setBackground(new Color(0, 0, 0));
btnDivision.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setOperator("/");
askNumbers();
}
});
btnDivision.setBounds(10, 210, 181, 40);
contentPane.add(btnDivision);
JButton btnPotencia = new JButton("Potencia");
btnPotencia.setForeground(new Color(255, 255, 255));
btnPotencia.setBackground(new Color(0, 0, 0));
btnPotencia.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setOperator("^");
askNumbers();
}
});
btnPotencia.setBounds(10, 113, 181 , 35);
contentPane.add(btnPotencia);
JButton btnRaizCuadrada = new JButton("Raíz cuadrada");
btnRaizCuadrada.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
askNumberForSquareRoot();
}
});
btnRaizCuadrada.setForeground(Color.WHITE);
btnRaizCuadrada.setBackground(Color.BLACK);
btnRaizCuadrada.setBounds(211, 168, 163, 40);
contentPane.add(btnRaizCuadrada);
}
private void setOperator(String op) {
operator = op;
}
private void askNumbers() {
try {
firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
calculate();
} catch (NumberFormatException e) {
txtDisplay.setText("Error: Ingrese números enteros válidos.");
}
}
private void askNumberForSquareRoot() {
try {
firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para calcular la raíz cuadrada:"));
calculateSquareRoot();
} catch (NumberFormatException e) {
txtDisplay.setText("Error: Ingrese un número entero válido.");
}
}
private void calculate() {
int result = 0;
switch (operator) {
case "+":
result = firstNumber + secondNumber;
break;
case "-":
result = firstNumber - secondNumber;
break;
case "*":
result = firstNumber * secondNumber;
break;
case "/":
if (secondNumber != 0) {
result = firstNumber / secondNumber;
} else {
txtDisplay.setText("Error: División por cero.");
return;
}
break;
case "^":
result = (int) Math.pow(firstNumber, secondNumber);
break;
}
txtDisplay.setText(Integer.toString(result));
}
private void calculateSquareRoot() {
int result = (int) Math.sqrt(firstNumber);
txtDisplay.setText(Integer.toString(result));
}
}

