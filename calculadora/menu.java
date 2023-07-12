package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu extends JFrame {
private JPanel contentPane;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
menu frame = new menu();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public menu() {
setTitle("MENU PRINCIPAL");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 400, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(139, 0, 139));
setContentPane(contentPane);
contentPane.setLayout(null);
JButton btnNumber1 = new JButton("1. Ingreso de n\u00FAmeros y realizaci\u00F3n de operaciones");
btnNumber1.setBackground(new Color(0, 0, 0));
btnNumber1.setForeground(new Color(255, 255, 255));
btnNumber1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	ejer1 menu = new ejer1();
	ejer1.main(new String[]{});
}
});
btnNumber1.setBounds(14, 11, 341, 44);
contentPane.add(btnNumber1);
JButton btnIngresoDe = new JButton("2. Ingreso de vectores y realizaci\u00F3n de operaciones");
btnIngresoDe.setForeground(new Color(255, 255, 255));
btnIngresoDe.setBackground(new Color(0, 0, 0));
btnIngresoDe.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	
	ejer2 menu = new ejer2();
	ejer2.main(new String[]{});
	
}
});
btnIngresoDe.setBounds(14, 66, 341, 48);
contentPane.add(btnIngresoDe);
JButton btnIngresoDe_1 = new JButton("3. Ingreso de matrices y realizaci\u00F3n de operaciones");
btnIngresoDe_1.setForeground(new Color(255, 255, 255));
btnIngresoDe_1.setBackground(new Color(0, 0, 0));
btnIngresoDe_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	matrices menu = new matrices();
	matrices.main(new String[]{});
}
});
btnIngresoDe_1.setBounds(14, 125, 341, 50);
contentPane.add(btnIngresoDe_1);
JButton btnIngresarUn = new JButton("4. Ingresar un sistema de ecuaciones y resolver");
btnIngresarUn.setForeground(new Color(255, 255, 255));
btnIngresarUn.setBackground(new Color(0, 0, 0));
btnIngresarUn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	ejer4 menu = new ejer4();
	ejer4.main(new String[]{});
}
});
btnIngresarUn.setBounds(14, 186, 341, 44);
contentPane.add(btnIngresarUn);
}
}
