package calculadora;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MultMTRxESC extends JFrame {

    private JPanel contentPane;
    private double firstOperand;
    private String operator;

    private int longitud = 5;
    private int[] numeros = new int[longitud];
    private int[] num1 = new int[3];
    private int[] num2 = new int[3];
    private int menu, i;
    private boolean menuAbierto = false;
    private JTextField Esc;
    private JTextField UC;
    private JTextField CC;
    private JTextField DC;
    private JTextField DU;
    private JTextField UU;
    private JTextField CU;
    private JTextField CD;
    private JTextField UD;
    private JTextField DD;
    private JTextField UCD;
    private JTextField CCD;
    private JTextField DCD;
    private JTextField DUD;
    private JTextField UUD;
    private JTextField CUD;
    private JTextField CTD;
    private JTextField UDD;
    private JTextField DDD;
    private JLabel lblMatrizUno;
    private JLabel lblEscalar;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	MultMTRxESC frame = new MultMTRxESC();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MultMTRxESC() {
        setTitle("Calculadora Matriz x Escalar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 597, 485);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEquals = new JButton("=");
        	btnEquals.addMouseListener(new MouseAdapter() {
            	public void mouseClicked(MouseEvent e) {
            		
            		int num = Integer.parseInt(Esc.getText());
            		int i,j;
            		
            		int[][] matriz = new int[3][3];
            		int[][] matriz_b = new int[3][3];
            		
            		
            		matriz[0][0] = Integer.parseInt(CC.getText());
            		matriz[0][1] = Integer.parseInt(CU.getText());
            		matriz[0][2] = Integer.parseInt(CD.getText());
            		matriz[1][0] = Integer.parseInt(UC.getText());
            		matriz[1][1] = Integer.parseInt(UU.getText());
            		matriz[1][2] = Integer.parseInt(UD.getText());
            		matriz[2][0] = Integer.parseInt(DC.getText());
            		matriz[2][1] = Integer.parseInt(DU.getText());
            		matriz[2][2] = Integer.parseInt(DD.getText());
            		
            		
            		for(i=0; i<3; i++) {
            			for(j=0; j<3; j++) {
            				
            				matriz_b[i][j] = matriz[i][j] * num;
            				
            			}
            		}
            		
            		 UCD = new JTextField();
            	        UCD.setColumns(10);
            	        UCD.setBounds(10, 284, 31, 20);
            	        contentPane.add(UCD);
            	        UCD.setEditable(false);
            	        UCD.setText(String.valueOf(matriz_b[1][0]));
            	        
            	        
            	        CCD = new JTextField();
            	        CCD.setColumns(10);
            	        CCD.setBounds(10, 253, 31, 20);
            	        contentPane.add(CCD);
            	        CCD.setEditable(false);
            	        CCD.setText(String.valueOf(matriz_b[0][0]));
            	        
            	        
            	        DCD = new JTextField();
            	        DCD.setColumns(10);
            	        DCD.setBounds(10, 315, 31, 20);
            	        contentPane.add(DCD);
            	        DCD.setEditable(false);
            	        DCD.setText(String.valueOf(matriz_b[2][0]));
            	        
            	        
            	        DUD = new JTextField();
            	        DUD.setColumns(10);
            	        DUD.setBounds(51, 315, 31, 20);
            	        contentPane.add(DUD);
            	        DUD.setEditable(false);
            	        DUD.setText(String.valueOf(matriz_b[2][1]));
            	        
            	        
            	        UUD = new JTextField();
            	        UUD.setColumns(10);
            	        UUD.setBounds(51, 284, 31, 20);
            	        contentPane.add(UUD);
            	        UUD.setEditable(false);
            	        UUD.setText(String.valueOf(matriz_b[1][1]));
            	        
            	        
            	        CUD = new JTextField();
            	        CUD.setColumns(10);
            	        CUD.setBounds(51, 253, 31, 20);
            	        contentPane.add(CUD);
            	        CUD.setEditable(false);
            	        CUD.setText(String.valueOf(matriz_b[0][1]));
            	        
            	        
            	        CTD = new JTextField();
            	        CTD.setColumns(10);
            	        CTD.setBounds(92, 253, 31, 20);
            	        contentPane.add(CTD);
            	        CTD.setEditable(false);
            	        CTD.setText(String.valueOf(matriz_b[0][2]));
            	        
            	        
            	        UDD = new JTextField();
            	        UDD.setColumns(10);
            	        UDD.setBounds(92, 284, 31, 20);
            	        contentPane.add(UDD);
            	        UDD.setEditable(false);
            	        UDD.setText(String.valueOf(matriz_b[1][2]));
            	        
            	        DDD = new JTextField();
            	        DDD.setColumns(10);
            	        DDD.setBounds(92, 315, 31, 20);
            	        contentPane.add(DDD);
            	        DDD.setEditable(false);
            	        DDD.setText(String.valueOf(matriz_b[2][2]));
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
        
        
   
        Esc = new JTextField();
        Esc.setHorizontalAlignment(SwingConstants.RIGHT);
        Esc.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Esc.setColumns(10);
        Esc.setBounds(283, 44, 207, 110);
        contentPane.add(Esc);
        
        UC = new JTextField();
        UC.setColumns(10);
        UC.setBounds(10, 75, 31, 20);
        contentPane.add(UC);
        
        CC = new JTextField();
        CC.setColumns(10);
        CC.setBounds(10, 44, 31, 20);
        contentPane.add(CC);
        
        DC = new JTextField();
        DC.setColumns(10);
        DC.setBounds(10, 106, 31, 20);
        contentPane.add(DC);
        
        DU = new JTextField();
        DU.setColumns(10);
        DU.setBounds(51, 106, 31, 20);
        contentPane.add(DU);
        
        UU = new JTextField();
        UU.setColumns(10);
        UU.setBounds(51, 75, 31, 20);
        contentPane.add(UU);
        
        CU = new JTextField();
        CU.setColumns(10);
        CU.setBounds(51, 44, 31, 20);
        contentPane.add(CU);
        
        CD = new JTextField();
        CD.setColumns(10);
        CD.setBounds(92, 44, 31, 20);
        contentPane.add(CD);
        
        UD = new JTextField();
        UD.setColumns(10);
        UD.setBounds(92, 75, 31, 20);
        contentPane.add(UD);
        
        DD = new JTextField();
        DD.setColumns(10);
        DD.setBounds(92, 106, 31, 20);
        contentPane.add(DD);
        
       
        
        
        
        JLabel lblNewLabel = new JLabel("MATRIZ RESULTADO");
        lblNewLabel.setBounds(10, 228, 113, 14);
        contentPane.add(lblNewLabel);
        
        
        lblMatrizUno = new JLabel("MATRIZ UNO");
        lblMatrizUno.setBounds(10, 15, 113, 14);
        contentPane.add(lblMatrizUno);
        
        lblEscalar = new JLabel("ESCALAR");
        lblEscalar.setBounds(283, 19, 113, 14);
        contentPane.add(lblEscalar);
    
        
    }
    

    private void appendToDisplay(String input) {
        JTextComponent txtDisplay = null;
		String currentText = txtDisplay.getText();
        txtDisplay.setText(currentText + input);
    }
}

