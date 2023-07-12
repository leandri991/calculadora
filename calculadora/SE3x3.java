package calculadora;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
public class SE3x3 {
double[][] sist = new double[3][4];
double[] incog = new double[3];
DecimalFormat df = new DecimalFormat("#.###");
private JFrame frame;
private JTextField textField_a;
private JTextField textField_b;
private JTextField textField_c;
private JTextField textField_d;
private JTextField textField_e;
private JTextField textField_f;
private JTextField textField_g;
private JTextField textField_h;
private JTextField textField_i;
private JTextField textField_j;
private JTextField textField_k;
private JTextField textField_l;
private JButton btnSolucion;
private JLabel lblNewLabel;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
private JLabel lblNewLabel_3;
private JLabel lblNewLabel_4;
private JLabel lblNewLabel_5;
private JLabel lblNewLabel_6;
private JLabel lblNewLabel_7;
private JLabel lblNewLabel_8;
private JLabel lblNewLabel_9;
private JLabel lblNewLabel_10;
private JLabel lblNewLabel_11;
private JLabel lblNewLabel_12;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JLabel lblNewLabel_13;
private JLabel lblNewLabel_14;
public SE3x3() {
initialize();
}
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 500, 500);
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
textField_g.setText("");
textField_h.setText("");
textField_i.setText("");
textField_j.setText("");
textField_k.setText("");
textField_l.setText("");
textField_3.setText("");
textField_4.setText("");
textField_5.setText("");
}
});
btnNewButton.setBounds(120, 267, 96, 23);
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
textField_d.setBounds(396, 11, 58, 49);
frame.getContentPane().add(textField_d);
textField_e = new JTextField();
textField_e.setColumns(10);
textField_e.setBounds(48, 98, 58, 49);
frame.getContentPane().add(textField_e);
textField_f = new JTextField();
textField_f.setColumns(10);
textField_f.setBounds(158, 98, 58, 49);
frame.getContentPane().add(textField_f);
textField_g = new JTextField();
textField_g.setColumns(10);
textField_g.setBounds(277, 98, 58, 49);
frame.getContentPane().add(textField_g);
textField_h = new JTextField();
textField_h.setColumns(10);
textField_h.setBounds(396, 98, 58, 49);
frame.getContentPane().add(textField_h);
textField_i = new JTextField();
textField_i.setColumns(10);
textField_i.setBounds(48, 185, 58, 49);
frame.getContentPane().add(textField_i);
textField_j = new JTextField();
textField_j.setColumns(10);
textField_j.setBounds(158, 185, 58, 49);
frame.getContentPane().add(textField_j);
textField_k = new JTextField();
textField_k.setColumns(10);
textField_k.setBounds(277, 185, 58, 49);
frame.getContentPane().add(textField_k);
textField_l = new JTextField();
textField_l.setColumns(10);
textField_l.setBounds(396, 185, 58, 49);
frame.getContentPane().add(textField_l);
btnSolucion = new JButton("Solucion");
btnSolucion.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
try {
sist[0][0] = Double.parseDouble(textField_a.getText());
sist[0][1] = Double.parseDouble(textField_b.getText());
sist[0][2] = Double.parseDouble(textField_c.getText());
sist[0][3] = Double.parseDouble(textField_d.getText());
sist[1][0] = Double.parseDouble(textField_e.getText());
sist[1][1] = Double.parseDouble(textField_f.getText());
sist[1][2] = Double.parseDouble(textField_g.getText());
sist[1][3] = Double.parseDouble(textField_h.getText());
sist[2][0] = Double.parseDouble(textField_i.getText());
sist[2][1] = Double.parseDouble(textField_j.getText());
sist[2][2] = Double.parseDouble(textField_k.getText());
sist[2][3] = Double.parseDouble(textField_l.getText());
for (int CEi = 0; CEi < 3; CEi++) {
for (int CEj = 0; CEj < 3; CEj++) {
if (CEi > CEj) {
double cof = sist[CEi][CEj] / sist[CEj][CEj];
for (int CEk = 0; CEk < 4; CEk++) {
sist[CEi][CEk] = sist[CEi][CEk] - cof * sist[CEj][CEk];
}
}
}
}
incog[2] = sist[2][3] / sist[2][2];
incog[1] = (sist[1][3] - sist[1][2] * incog[2]) / sist[1][1];
incog[0] = (sist[0][3] - sist[0][1] * incog[1] - sist[0][2] * incog[2]) / sist[0][0];
String seleccionar = df.format(incog[0]);
seleccionar = seleccionar.replace(",", ".");
textField_3.setText(seleccionar);
seleccionar = df.format(incog[1]);
seleccionar = seleccionar.replace(",", ".");
textField_4.setText(seleccionar);
seleccionar = df.format(incog[2]);
seleccionar = seleccionar.replace(",", ".");
textField_5.setText(seleccionar);
} catch (NumberFormatException ex) {
}
}
});
btnSolucion.setBounds(312, 267, 89, 23);
frame.getContentPane().add(btnSolucion);
lblNewLabel = new JLabel("Z:");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setBounds(0, 11, 46, 49);
frame.getContentPane().add(lblNewLabel);
lblNewLabel_1 = new JLabel("Z:");
lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_1.setBounds(0, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_1);
lblNewLabel_2 = new JLabel("Z:");
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setBounds(0, 185, 46, 49);
frame.getContentPane().add(lblNewLabel_2);
lblNewLabel_3 = new JLabel("Y:");
lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_3.setBounds(114, 11, 46, 49);
frame.getContentPane().add(lblNewLabel_3);
lblNewLabel_4 = new JLabel("Y:");
lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4.setBounds(114, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_4);
lblNewLabel_5 = new JLabel("Y:");
lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_5.setBounds(114, 185, 46, 49);
frame.getContentPane().add(lblNewLabel_5);
lblNewLabel_6 = new JLabel("X:");
lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_6.setBounds(226, 11, 46, 49);
frame.getContentPane().add(lblNewLabel_6);
lblNewLabel_7 = new JLabel("X:");
lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_7.setBounds(226, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_7);
lblNewLabel_8 = new JLabel("X:");
lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_8.setBounds(226, 185, 46, 49);
frame.getContentPane().add(lblNewLabel_8);
lblNewLabel_9 = new JLabel("W:");
lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_9.setBounds(336, 11, 46, 49);
frame.getContentPane().add(lblNewLabel_9);
lblNewLabel_10 = new JLabel("W:");
lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_10.setBounds(336, 98, 46, 49);
frame.getContentPane().add(lblNewLabel_10);
lblNewLabel_11 = new JLabel("W:");
lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_11.setBounds(336, 185, 46, 49);
frame.getContentPane().add(lblNewLabel_11);
textField_3 = new JTextField();
textField_3.setEditable(false);
textField_3.setBounds(80, 345, 58, 20);
frame.getContentPane().add(textField_3);
textField_3.setColumns(10);
textField_4 = new JTextField();
textField_4.setEditable(false);
textField_4.setColumns(10);
textField_4.setBounds(214, 345, 58, 20);
frame.getContentPane().add(textField_4);
textField_5 = new JTextField();
textField_5.setEditable(false);
textField_5.setColumns(10);
textField_5.setBounds(336, 345, 58, 20);
frame.getContentPane().add(textField_5);
lblNewLabel_12 = new JLabel("Z=");
lblNewLabel_12.setBounds(60, 348, 46, 14);
frame.getContentPane().add(lblNewLabel_12);
lblNewLabel_14 = new JLabel("X=");
lblNewLabel_14.setBounds(317, 348, 46, 14);
frame.getContentPane().add(lblNewLabel_14);
lblNewLabel_13 = new JLabel("Y=");
lblNewLabel_13.setBounds(193, 348, 46, 14);
frame.getContentPane().add(lblNewLabel_13);
}
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SE3x3 window = new SE3x3();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
}
