package calculadora;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Division extends JFrame {

    private JPanel contentPane;
    private double firstOperand;
    private String operator;

    private int longitud = 5;
    private int[] numeros = new int[longitud];
    private int[] num1 = new int[3];
    private int[] num2 = new int[3];
    private int menu, i;
    private boolean menuAbierto = false;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Division frame = new Division();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Division() {
        setTitle("Calculadora Division Matrices");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 597, 485);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnMatrizUno = new JButton("Matriz Uno");
        btnMatrizUno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("0");
            }
        });
        btnMatrizUno.setBounds(10, 11, 113, 22);
        contentPane.add(btnMatrizUno);

        JButton btnEquals = new JButton("=");
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        btnEquals.setBounds(336, 295, 60, 40);
        contentPane.add(btnEquals);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(240, 240, 240));
        menuBar.setToolTipText("");
        menuBar.setBounds(520, 0, 60, 33);
        contentPane.add(menuBar);
        
        JMenu mnNewMenu = new JMenu("Menu");
        mnNewMenu.setBackground(new Color(255, 0, 128));
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem1 = new JMenuItem("Volver");
        mntmNewMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	matrices matrices= new matrices();
            	matrices.show();
            	
            	dispose();
            
            }
        });

        mnNewMenu.add(mntmNewMenuItem1);
        
        JButton btnMatrizDos = new JButton("Matriz Dos");
        btnMatrizDos.setBounds(283, 11, 113, 22);
        contentPane.add(btnMatrizDos);
        
        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_1.setColumns(10);
        textField_1.setBounds(10, 257, 207, 110);
        contentPane.add(textField_1);
        
        JButton btnMatrizResultado = new JButton("Matriz Resultado");
        btnMatrizResultado.setBounds(10, 200, 141, 22);
        contentPane.add(btnMatrizResultado);
        
        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_2.setColumns(10);
        textField_2.setBounds(283, 44, 207, 110);
        contentPane.add(textField_2);
        
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField.setColumns(10);
        textField.setBounds(10, 44, 207, 110);
        contentPane.add(textField);
    
        
    }
    

    private void appendToDisplay(String input) {
        JTextComponent txtDisplay = null;
		String currentText = txtDisplay.getText();
        txtDisplay.setText(currentText + input);
    }
}

