package calculadora;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MultMTRxMTR extends JFrame {

    private JPanel contentPane;
    private double firstOperand;
    private String operator;

    private int longitud = 5;
    private int[] numeros = new int[longitud];
    private int[] num1 = new int[3];
    private int[] num2 = new int[3];
    private int menu, i;
    private boolean menuAbierto = false;
    
  //Varibales de la matriz uno
    private JTextField UC;
    private JTextField CC;
    private JTextField DC;
    private JTextField DU;
    private JTextField UU;
    private JTextField CU;
    private JTextField CD;
    private JTextField UD;
    private JTextField DD;
    
    //Varibales de la matriz resultado
    private JTextField UCT;
    private JTextField CCT;
    private JTextField DCT;
    private JTextField DUT;
    private JTextField UUT;
    private JTextField CUT;
    private JTextField CDT;
    private JTextField UDT;
    private JTextField DDT;
    private JLabel lblMatrizUno;
    
  //Varibales de la matriz dos
    private JTextField DCD;
    private JTextField DUD;
    private JTextField DDD;
    private JTextField UDD;
    private JTextField CDD;
    private JTextField CUD;
    private JTextField CCD;
    private JTextField UCD;
    private JTextField UUD;
    private JLabel lblMatrizDos;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	MultMTRxMTR frame = new MultMTRxMTR();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MultMTRxMTR() {
        setTitle("Calculadora Matriz x Matriz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 597, 485);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEquals = new JButton("=");
        	btnEquals.addMouseListener(new MouseAdapter() {
            	public void mouseClicked(MouseEvent e) {
            		
            		
            		int i,j;
            		
            		int[][] matriz = new int[3][3];
            		int[][] matriz_b = new int[3][3];
            		
            		int[][] matriz_r = new int[3][3];
            		
            		//Posiciones de la matriz uno
            		matriz[0][0] = Integer.parseInt(CC.getText());
            		matriz[0][1] = Integer.parseInt(CU.getText());
            		matriz[0][2] = Integer.parseInt(CD.getText());
            		matriz[1][0] = Integer.parseInt(UC.getText());
            		matriz[1][1] = Integer.parseInt(UU.getText());
            		matriz[1][2] = Integer.parseInt(UD.getText());
            		matriz[2][0] = Integer.parseInt(DC.getText());
            		matriz[2][1] = Integer.parseInt(DU.getText());
            		matriz[2][2] = Integer.parseInt(DD.getText());
            		
            		//Posicion de la matriz dos
            		matriz_b[0][0] = Integer.parseInt(CCD.getText());
            		matriz_b[0][1] = Integer.parseInt(CUD.getText());
            		matriz_b[0][2] = Integer.parseInt(CDD.getText());
            		matriz_b[1][0] = Integer.parseInt(UCD.getText());
            		matriz_b[1][1] = Integer.parseInt(UUD.getText());
            		matriz_b[1][2] = Integer.parseInt(UDD.getText());
            		matriz_b[2][0] = Integer.parseInt(DCD.getText());
            		matriz_b[2][1] = Integer.parseInt(DUD.getText());
            		matriz_b[2][2] = Integer.parseInt(DDD.getText());
            		
            		
            		  for ( i = 0; i < 3; i++) {
            	            for ( j = 0; j < 3; j++) {
            	                for (int k = 0; k < 3; k++) {
            	                    matriz_r[i][j] += matriz[i][k] * matriz_b[k][j];
            	                }
            	            }
            	        }
            		
            	  	    UCT = new JTextField();
            	        UCT.setColumns(10);
            	        UCT.setBounds(10, 284, 31, 20);
            	        contentPane.add(UCT);
            	        UCT.setEditable(false);
            	        UCT.setText(String.valueOf(matriz_r[1][0]));
            	        
            	        
            	        CCT = new JTextField();
            	        CCT.setColumns(10);
            	        CCT.setBounds(10, 253, 31, 20);
            	        contentPane.add(CCT);
            	        CCT.setEditable(false);
            	        CCT.setText(String.valueOf(matriz_r[0][0]));
            	        
            	        
            	        DCT = new JTextField();
            	        DCT.setColumns(10);
            	        DCT.setBounds(10, 315, 31, 20);
            	        contentPane.add(DCT);
            	        DCT.setEditable(false);
            	        DCT.setText(String.valueOf(matriz_r[2][0]));
            	        
            	        
            	        DUT = new JTextField();
            	        DUT.setColumns(10);
            	        DUT.setBounds(51, 315, 31, 20);
            	        contentPane.add(DUT);
            	        DUT.setEditable(false);
            	        DUT.setText(String.valueOf(matriz_r[2][1]));
            	        
            	        
            	        UUT = new JTextField();
            	        UUT.setColumns(10);
            	        UUT.setBounds(51, 284, 31, 20);
            	        contentPane.add(UUT);
            	        UUT.setEditable(false);
            	        UUT.setText(String.valueOf(matriz_r[1][1]));
            	        
            	        
            	        CUT = new JTextField();
            	        CUT.setColumns(10);
            	        CUT.setBounds(51, 253, 31, 20);
            	        contentPane.add(CUT);
            	        CUT.setEditable(false);
            	        CUT.setText(String.valueOf(matriz_r[0][1]));
            	        
            	        
            	        CDT = new JTextField();
            	        CDT.setColumns(10);
            	        CDT.setBounds(92, 253, 31, 20);
            	        contentPane.add(CDT);
            	        CDT.setEditable(false);
            	        CDT.setText(String.valueOf(matriz_r[0][2]));
            	        
            	        
            	        UDT = new JTextField();
            	        UDT.setColumns(10);
            	        UDT.setBounds(92, 284, 31, 20);
            	        contentPane.add(UDT);
            	        UDT.setEditable(false);
            	        UDT.setText(String.valueOf(matriz_r[1][2]));
            	        
            	        DDT = new JTextField();
            	        DDT.setColumns(10);
            	        DDT.setBounds(92, 315, 31, 20);
            	        contentPane.add(DDT);
            	        DDT.setEditable(false);
            	        DDT.setText(String.valueOf(matriz_r[2][2]));
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
        
      
        
        DCD = new JTextField();
        DCD.setColumns(10);
        DCD.setBounds(283, 106, 31, 20);
        contentPane.add(DCD);
        
        DUD = new JTextField();
        DUD.setColumns(10);
        DUD.setBounds(324, 106, 31, 20);
        contentPane.add(DUD);
        
        DDD = new JTextField();
        DDD.setColumns(10);
        DDD.setBounds(365, 106, 31, 20);
        contentPane.add(DDD);
        
        UDD = new JTextField();
        UDD.setColumns(10);
        UDD.setBounds(365, 75, 31, 20);
        contentPane.add(UDD);
        
        CDD = new JTextField();
        CDD.setColumns(10);
        CDD.setBounds(365, 44, 31, 20);
        contentPane.add(CDD);
        
        CUD = new JTextField();
        CUD.setColumns(10);
        CUD.setBounds(324, 44, 31, 20);
        contentPane.add(CUD);
        
        CCD = new JTextField();
        CCD.setColumns(10);
        CCD.setBounds(283, 44, 31, 20);
        contentPane.add(CCD);
        
        UCD = new JTextField();
        UCD.setColumns(10);
        UCD.setBounds(283, 75, 31, 20);
        contentPane.add(UCD);
        
        UUD = new JTextField();
        UUD.setColumns(10);
        UUD.setBounds(324, 75, 31, 20);
        contentPane.add(UUD);
        
        lblMatrizDos = new JLabel("MATRIZ DOS");
        lblMatrizDos.setBounds(283, 15, 113, 14);
        contentPane.add(lblMatrizDos);
    
        
    }
    

    private void appendToDisplay(String input) {
        JTextComponent txtDisplay = null;
		String currentText = txtDisplay.getText();
        txtDisplay.setText(currentText + input);
    }
}

