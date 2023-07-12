package calculadora;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class SE2X2 {
double numeroa;
double numerob;
double numeroc;
double numerod;
double numeroe;
double numerof;
private JFrame frame;
private JTextField textField_a;
private JTextField textField_b;
private JTextField textField_c;
private JTextField textField_d;
private JTextField textField_e;
private JTextField textField_f;
private JButton btnSolucion;
private JLabel lblNewLabel;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
private JLabel lblNewLabel_3;
private JLabel lblNewLabel_4;
private JLabel lblNewLabel_5;
private JLabel lblNewLabel_6;
private JTextField textField;
private JLabel lblNewLabel_8;
private JTextField textField_2;
public SE2X2() {
initialize();
}
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JButton btnNewButton = new JButton("AC");
btnNewButton.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
textField_a.setText("");
textField_b.setText("");
textField_c.setText("");
textField_d.setText("");
textField_e.setText("");
textField_f.setText("");
textField.setText("");
textField_2.setText("");
}
});
btnNewButton.setBounds(102, 171, 58, 23);
frame.getContentPane().add(btnNewButton);
textField_a = new JTextField();
textField_a.setBounds(48, 11, 58, 49);
frame.getContentPane().add(textField_a);
textField_a.setColumns(10);
textField_b = new JTextField();
textField_b.setColumns(10);
textField_b.setBounds(158, 11, 58, 49);
frame.getContentPane().add(textField_b);
textField_c = new JTextField();
textField_c.setColumns(10);
textField_c.setBounds(277, 11, 58, 49);
frame.getContentPane().add(textField_c);
textField_d = new JTextField();
textField_d.setColumns(10);
textField_d.setBounds(48, 98, 58, 49);
frame.getContentPane().add(textField_d);
textField_e = new JTextField();
textField_e.setColumns(10);
textField_e.setBounds(158, 98, 58, 49);
frame.getContentPane().add(textField_e);
textField_f = new JTextField();
textField_f.setColumns(10);
textField_f.setBounds(277, 98, 58, 49);
frame.getContentPane().add(textField_f);
btnSolucion = new JButton("Solucion");
btnSolucion.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
try {
numeroa = Double.parseDouble(textField_a.getText());
numerob = Double.parseDouble(textField_b.getText());
numeroc = Double.parseDouble(textField_c.getText());
numerod = Double.parseDouble(textField_d.getText());
numeroe = Double.parseDouble(textField_e.getText());
numerof = Double.parseDouble(textField_f.getText());
double determinante = (numeroa * numerod) - (numerob * numeroc);
double solucionX = ((numeroe * numerod) - (numerob * numerof)) / determinante;
double solucionY = ((numeroa * numerof) - (numeroe * numeroc)) / determinante;
textField.setText(Double.toString(solucionX));
textField_2.setText(Double.toString(solucionY));
} catch (NumberFormatException ex) {
// Manejar error de formato numérico
}
}
});
btnSolucion.setBounds(215, 171, 89, 23);
frame.getContentPane().add(btnSolucion);
lblNewLabel = new JLabel("Z:");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setBounds(0, 11, 46, 49);
frame.getContentPane().add(lblNewLabel);
lblNewLabel_1 = new JLabel("Z:");
lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1.setBounds(0, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_1);
lblNewLabel_2 = new JLabel("Y:");
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setBounds(114, 11, 46, 49);
frame.getContentPane().add(lblNewLabel_2);
lblNewLabel_3 = new JLabel("Y:");
lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_3.setBounds(114, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_3);
lblNewLabel_4 = new JLabel("=");
lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4.setBounds(226, 11, 46, 49);
frame.getContentPane().add(lblNewLabel_4);
lblNewLabel_5 = new JLabel("=");
lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_5.setBounds(226, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_5);
lblNewLabel_6 = new JLabel("Z=");
lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_6.setBounds(60, 205, 46, 49);
frame.getContentPane().add(lblNewLabel_6);
textField = new JTextField();
textField.setBounds(102, 219, 58, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);
lblNewLabel_8 = new JLabel("Y=");
lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_8.setBounds(208, 205, 46, 49);
frame.getContentPane().add(lblNewLabel_8);
textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(246, 219, 58, 20);
frame.getContentPane().add(textField_2);
// Cierre del método initialize()
}
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	SE2X2 window = new SE2X2();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
}
