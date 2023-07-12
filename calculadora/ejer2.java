package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ejer2 extends JFrame {
private JPanel contentPane;
private JTextField txtDisplay;
private double firstOperand;
private String operator;
private JLabel lblResultado;
public static void main(String[] args) {
	
	UIManager.put("OptionPane.background", new Color(139, 0, 139));
UIManager.put("Panel.background", new Color(139, 0, 139));
UIManager.put("Button.background", new Color(0, 0, 0));
UIManager.put("Button.foreground", new Color(255,255,255));
UIManager.put("OptionPane.messageForeground", Color.white);
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	ejer2 frame = new ejer2();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public ejer2() {
setTitle("Calculadora-vectores");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 400, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(139, 0, 139));
setContentPane(contentPane);
contentPane.setLayout(null);
txtDisplay = new JTextField();
txtDisplay.setEditable(false);
txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
txtDisplay.setBounds(10, 11, 364, 40);
contentPane.add(txtDisplay);
txtDisplay.setColumns(10);
JButton btnNumber1 = new JButton("1) Suma y resta");
btnNumber1.setForeground(new Color(255, 255, 255));
btnNumber1.setBackground(new Color(0, 0, 0));
btnNumber1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 realizarOperaciones(1);
}
});
btnNumber1.setBounds(10, 62, 347, 40);
contentPane.add(btnNumber1);
JButton button_1 = new JButton("2) Multiplicación de escalar por vector\r\n"+ "");
button_1.setForeground(new Color(255, 255, 255));
button_1.setBackground(new Color(0, 0, 0));
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 realizarOperaciones(2);
}
});
button_1.setBounds(10, 111, 347 , 37);
contentPane.add(button_1);
JButton button_2 = new JButton("3) Producto escalar\r\n"+ "");
button_2.setForeground(new Color(255, 255, 255));
button_2.setBackground(new Color(0, 0, 0));
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 realizarOperaciones(3);
}
});
button_2.setBounds(10, 159, 347, 40);
contentPane.add(button_2);
JButton button_2_1 = new JButton("4) Producto vectorial\r\n"+ ".- ");
button_2_1.setForeground(new Color(255, 255, 255));
button_2_1.setBackground(new Color(0, 0, 0));
button_2_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 realizarOperaciones(4);
}
});
button_2_1.setBounds(10, 210, 347, 40);
contentPane.add(button_2_1);
}
private void appendToDisplay(String input) {
String currentText = txtDisplay.getText();
txtDisplay.setText(currentText + input);
}
private void setOperator(String op) {
firstOperand = Double.parseDouble(txtDisplay.getText());
operator = op;
txtDisplay.setText("");
}
private void calculate() {
double secondOperand = Double.parseDouble(txtDisplay.getText());
double result = 0.0;
switch (operator) {
case "+":
result = firstOperand + secondOperand;
break;
}
txtDisplay.setText(Double.toString(result));
}
private void realizarOperaciones(int opcion) {
int longitud = 5;
int[] numeros = new int[longitud];
int[] num11 = new int[longitud];
int[] num22 = new int[longitud];
int[] num1 = new int[3];
int[] num2 = new int[3];
int i;
int[] suma = new int[longitud];
int[] resta = new int[longitud];
String resultado = "";
switch (opcion) {
case 1:
	 pedirNumeros(num11, num22, longitud);
	 for (i = 0; i < longitud; i++) {
	 suma[i] = num11[i] + num22[i];
	 resta[i] = num11[i] - num22[i];
	 }
	 resultado += "Suma: ";
	 for (i = 0; i < longitud; i++) {
	 resultado += suma[i] + " ";
	 }
	 resultado += "\nResta: ";
	 for (i = 0; i < longitud; i++) {
	 resultado += resta[i] + " ";
	 }
break;
case 2:
	pedirNumeros2(numeros, longitud);
int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Por cuanto quiere multiplicar: "));
int[] multiplicar = new int[longitud];
for (i = 0; i < longitud; i++) {
multiplicar[i] = numeros[i] * multiplicador;
}
resultado += "producto escalar: ";
for (i = 0; i < longitud; i++) {
resultado += multiplicar[i] + " ";
}
break;
case 3:
	pedirNumeros2(numeros, longitud);
int[] numeros1 = new int[longitud];
int[] pe2 = new int[longitud];
int suma1 = 0;
for (i = 0; i < longitud; i++) {
numeros1[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa un número para el 2do vector en el puesto"+ (i + 1) + ":"));
}
for (i = 0; i < longitud; i++) {
pe2[i] = numeros[i] * numeros1[i];
}
resultado += "multiplicacion: ";
for (i = 0; i < longitud; i++) {
resultado += pe2[i] + " ";
}
for (i = 0; i < longitud; i++) {
suma1 += pe2[i];
}
resultado += "\nProducto escalar: " + suma1;
break;
	
case 4:
pedirNum(num1, num2);
int[] num = new int[3];
num[0] = (num1[1] * num2[2]) - (num1[2] * num2[1]);
num[1] = (num1[2] * num2[0]) - (num1[0] * num2[2]);
num[2] = (num1[0] * num2[1]) - (num1[1] * num2[0]);
resultado = "Producto vectorial: (" + num[0] + ", " + num[1] + ", " + num[2] + ")";
break;
}
txtDisplay.setText(resultado);
}
public static void pedirNumeros(int[] num11,int[] num22 , int longitud) {
int i;
for (i = 0; i < longitud; i++) {
num11[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese números para el 1er vector del Puesto " + (i + 1) + ":"));
}
for (i = 0; i < longitud; i++) {
num22[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese números para el 2do vector del Puesto " + (i + 1) + ":"));
}
}
public static void pedirNumeros2(int[] numeros, int longitud) {
int i;
for (i = 0; i < longitud; i++) {
numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese números para el puesto " + (i + 1) + ":"));
}
}
public static void pedirNum(int[] num1, int[] num2) {
int i;
for (i = 0; i < 3; i++) {
num1[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa 3 números del 1er vector:"));
}
for (i = 0; i < 3; i++) {
num2[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa 3 números del 2do vector:"));
}
}
}




