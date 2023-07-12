package calculadora;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Deter extends JFrame implements ActionListener{
	private JButton btnSum_1;
	private JButton btnSum_2;
	private JButton btnSum_3;
	private JButton btnSum_4;
	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JLabel lblMostrar;
	private JPanel resultadoPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField22;
	private JLabel lblMatrizUno;
	private JLabel lblDeterminanye;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deter frame = new Deter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Deter() {
		setTitle("Calculadora Determinante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 596, 575);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSum_3_1 = new JButton("=");
		btnSum_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSum_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                int[][] matriz = new int[3][3];
                int[][] matriz_g = new int[5][3];
                int op, det;
                int m = 3, n = 3, i, j; 
                
                matriz[0][0] = Integer.parseInt(textField_2.getText());
                matriz[0][1] = Integer.parseInt(textField_3.getText());
                matriz[0][2] = Integer.parseInt(textField_4.getText());
                matriz[1][0] = Integer.parseInt(textField_5.getText());
                matriz[1][1] = Integer.parseInt(textField_6.getText());
                matriz[1][2] = Integer.parseInt(textField_7.getText());
                matriz[2][0] = Integer.parseInt(textField_8.getText());
                matriz[2][1] = Integer.parseInt(textField_9.getText());
                matriz[2][2] = Integer.parseInt(textField_10.getText());
                
                for( i=0; i<3; i++){
                    
                    for(j=0;j<3;j++){
                        
                        matriz_g[i][j] = matriz[i][j]; 
                        
                    }
                    
                }
                
                for(i=3; i<5; i++){
                    
                    for(j=0;j<3;j++){
                        
                        matriz_g[i][j] = matriz[(i-3)][j]; 	
                        
                    }
                    
                }
                
                
                int a = matriz_g[0][0] * matriz_g[1][1] * matriz_g[2][2];
                int b = matriz_g[1][0] * matriz_g[2][1] * matriz_g[3][2];
                int c = matriz_g[2][0] * matriz_g[3][1] * matriz_g[4][2];
                
                int	d = a + b + c;
                
                int e1 = matriz_g[0][2] * matriz_g[1][1] * matriz_g[2][0];
                int f = matriz_g[1][2] * matriz_g[2][1] * matriz_g[3][0];
                int g = matriz_g[2][2] * matriz_g[3][1] * matriz_g[4][0];
                
                int	h = e1 + f + g;				
                
                det = d - h;
                
	      		textField_1 = new JTextField();
	      		textField_1.setEnabled(true);
	      		textField_1.setEditable(false);
	      		textField_1.setColumns(10);
	      		textField_1.setBounds(268, 426, 34, 35);
	      		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
	      		textField_1.setForeground(SystemColor.black);
	      		panel.add(textField_1);
	      		textField_1.setText(String.valueOf(det));
			}
		});
		btnSum_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSum_3_1.setBounds(336, 295, 60, 40);
		panel.add(btnSum_3_1);
		
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 44, 31, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(51, 44, 31, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 44, 31, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 75, 31, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(51, 75, 31, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(92, 75, 31, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 106, 31, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(51, 106, 31, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(92, 106, 31, 20);
		panel.add(textField_10);
		
		lblMatrizUno = new JLabel("MATRIZ UNO");
		lblMatrizUno.setBounds(10, 19, 113, 14);
		panel.add(lblMatrizUno);
		
		lblDeterminanye = new JLabel("DETERMINANTE");
		lblDeterminanye.setBounds(10, 197, 113, 14);
		panel.add(lblDeterminanye);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(485, 11, 101, 22);
		panel.add(menuBar);
		
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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}