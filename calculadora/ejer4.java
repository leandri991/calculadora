package calculadora;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ejer4 extends JFrame {
/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
private JTextField txtElijaUnSistema;

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	ejer4 frame = new ejer4();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public ejer4() {
setTitle("Calculadora");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 400, 300);
contentPane = new JPanel();
setContentPane(contentPane);
contentPane.setLayout(null);
JButton btnNewButton = new JButton("2x2");
btnNewButton.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		SwingUtilities.invokeLater(() -> {
			SE2X2 Calcu = new SE2X2();
			SE2X2.main(new String[] {});
		});

	}
});
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

	}
});
btnNewButton.setBounds(60, 82, 89, 77);
contentPane.add(btnNewButton);
JButton btnx = new JButton("3x3");
btnx.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		SE3x3 Calcu = new SE3x3();
		SE3x3.main(new String[] {});
	}
});
btnx.setBounds(234, 82, 89, 77);
contentPane.add(btnx);
txtElijaUnSistema = new JTextField();
txtElijaUnSistema.setHorizontalAlignment(SwingConstants.CENTER);
txtElijaUnSistema.setText("Elija un sistema de ecuaciones");
txtElijaUnSistema.setEditable(false);
txtElijaUnSistema.setBounds(101, 24, 189, 35);
contentPane.add(txtElijaUnSistema);
txtElijaUnSistema.setColumns(10);
JMenuBar menuBar = new JMenuBar();
setJMenuBar(menuBar);
JMenu mnNewMenu = new JMenu("Menu");
menuBar.add(mnNewMenu);
JMenuItem mntmNewMenuItem1 = new JMenuItem("1. Ingreso de números y realización de operaciones");
mntmNewMenuItem1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

}
});
mnNewMenu.add(mntmNewMenuItem1);
JMenuItem mntmNewMenuItem2 = new JMenuItem("2. Ingreso de vectores y realización de operaciones");
mntmNewMenuItem2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

}
});
mnNewMenu.add(mntmNewMenuItem2);
JMenuItem mntmNewMenuItem3 = new JMenuItem("3. Ingreso de matrices y realización de operaciones");
mntmNewMenuItem3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

}
});
mnNewMenu.add(mntmNewMenuItem3);
JMenuItem mntmNewMenuItem4 = new JMenuItem("4. Ingresar un sistema de ecuaciones y resolver");
mntmNewMenuItem4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

}
});
mnNewMenu.add(mntmNewMenuItem4);
}
}
