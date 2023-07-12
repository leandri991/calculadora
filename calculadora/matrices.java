package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class matrices extends JFrame {

    private JPanel contentPane;
    private JTextField txtDisplay;
    private double firstOperand;
    private String operator;

    private int longitud = 5;
    private int[] numeros = new int[longitud];
    private int[] num1 = new int[3];
    private int[] num2 = new int[3];
    private int menu, i;
    private boolean menuAbierto = false;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	matrices frame = new matrices();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public matrices() {
        setTitle("Calculadora de Matrices");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setBounds(10, 11, 282, 40);
        contentPane.add(txtDisplay);
        txtDisplay.setColumns(10);

        JButton btnNumber1 = new JButton("1");
        btnNumber1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("1");
            }
        });
        btnNumber1.setBounds(14, 80, 66, 22);
        contentPane.add(btnNumber1);

        JButton button_1 = new JButton("2");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("2");
            }
        });
        button_1.setBounds(90, 80, 70, 22);
        contentPane.add(button_1);

        JButton button_2 = new JButton("3");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("3");
            }
        });
        button_2.setBounds(170, 80, 70, 22);
        contentPane.add(button_2);

        JButton button_2_1 = new JButton("4");
        button_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("4");
            }
        });
        button_2_1.setBounds(14, 112, 66, 22);
        contentPane.add(button_2_1);

        JButton button_2_2 = new JButton("5");
        button_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("5");
            }
        });
        button_2_2.setBounds(90, 113, 70, 22);
        contentPane.add(button_2_2);

        JButton button_2_3 = new JButton("6");
        button_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("6");
            }
        });
        button_2_3.setBounds(170, 113, 70, 22);
        contentPane.add(button_2_3);

        JButton button_2_21 = new JButton("7");
        button_2_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("7");
            }
        });
        button_2_21.setBounds(14, 146, 66, 22);
        contentPane.add(button_2_21);

        JButton button_2_5 = new JButton("8");
        button_2_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("8");
            }
        });
        button_2_5.setBounds(90, 146, 70, 22);
        contentPane.add(button_2_5);

        JButton button_2_6 = new JButton("9");
        button_2_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("9");
            }
        });
        button_2_6.setBounds(170, 146, 70, 22);
        contentPane.add(button_2_6);

        JButton button_2_7 = new JButton("0");
        button_2_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendToDisplay("0");
            }
        });
        button_2_7.setBounds(170, 179, 70, 22);
        contentPane.add(button_2_7);

        JButton btnEquals = new JButton("=");
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        btnEquals.setBounds(20, 188, 60, 40);
        contentPane.add(btnEquals);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(240, 240, 240));
        menuBar.setToolTipText("");
        menuBar.setBounds(273, 62, 101, 22);
        contentPane.add(menuBar);
        
        JMenu mnNewMenu = new JMenu("Menu");
        mnNewMenu.setBackground(new Color(255, 0, 128));
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem1 = new JMenuItem("Suma");
        mntmNewMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	Suma Suma = new Suma();
            	Suma.show();
            	
            	dispose();
            	
        		
        		
            }
        });

        mnNewMenu.add(mntmNewMenuItem1);
        
        
        JMenuItem mntmNewMenuItem2 = new JMenuItem("Resta");
        mntmNewMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	Resta Resta = new Resta();
            	Resta.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem2);
        
        
        
        JMenuItem mntmNewMenuItem3 = new JMenuItem("Mult. MTRxESC");
        mntmNewMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	MultMTRxESC MultMTRxESC = new MultMTRxESC();
            	MultMTRxESC.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem3);
    
        
        
        
        JMenuItem mntmNewMenuItem4 = new JMenuItem("Mult. MTRxMTR");
        mntmNewMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	MultMTRxMTR MultMTRxMTR = new MultMTRxMTR();
            	MultMTRxMTR.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem4);
        
    
        
        
        
        JMenuItem mntmNewMenuItem5 = new JMenuItem("Determinante");
        mntmNewMenuItem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	Deter Deter = new Deter();
            	Deter.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem5);
        
        
        
        
        
        
        
        
        
        JMenuItem mntmNewMenuItem6 = new JMenuItem("Inversa de Matriz");
        mntmNewMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	Inversa Inversa = new Inversa();
            	Inversa.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem6);
        
        
        
        
        
        JMenuItem mntmNewMenuItem7 = new JMenuItem("Divison de Matriz");
        mntmNewMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	Division Division = new Division();
            	Division.show();
            	
            	dispose();
                
            }
        });

        mnNewMenu.add(mntmNewMenuItem7);
        
        
    }
        
        
        
        
        
        
        
    public static void pedirnumeros(int[] numeros, int longitud) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        // Crea y configura los componentes de entrada de texto
        JLabel label = new JLabel("Ingrese los números:");
        panel.add(label);
        
        JTextField[] textFields = new JTextField[longitud];
        for (int i = 0; i < longitud; i++) {
            textFields[i] = new JTextField(5); // Configura el tamaño del campo de texto según tus necesidades
            panel.add(textFields[i]);
        }
        
        // Muestra un diálogo de entrada de texto
        JOptionPane.showMessageDialog(frame, panel, "Ingreso de números", JOptionPane.PLAIN_MESSAGE);
        
        // Lee los valores ingresados por el usuario y los asigna al arreglo "numeros"
        for (int i = 0; i < longitud; i++) {
            numeros[i] = Integer.parseInt(textFields[i].getText());
        }
    }
    
    
    
    
    
    
    

    private void appendToDisplay(String input) {
        String currentText = txtDisplay.getText();
        txtDisplay.setText(currentText + input);
    }
}
