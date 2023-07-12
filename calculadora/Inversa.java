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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;


public class Inversa extends JFrame implements ActionListener{
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


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inversa frame = new Inversa();
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
	public Inversa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 636);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();

		panel.setBounds(10, 11, 596, 575);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSum_2_1 = new JButton("MATRIZ INVERSA");
		btnSum_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSum_2_1.setBorder(null);
		btnSum_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int m = 3, n = 3, i, j, k; 
                int cont = 0;
                float[][] matriz = new float[3][3];
                float[][] matriz_g = new float[5][3];
                matriz[0][0] = Integer.parseInt(textField_2.getText());
                matriz[0][1] = Integer.parseInt(textField_3.getText());
                matriz[0][2] = Integer.parseInt(textField_4.getText());
                matriz[1][0] = Integer.parseInt(textField_5.getText());
                matriz[1][1] = Integer.parseInt(textField_6.getText());
                matriz[1][2] = Integer.parseInt(textField_7.getText());
                matriz[2][0] = Integer.parseInt(textField_8.getText());
                matriz[2][1] = Integer.parseInt(textField_9.getText());
                matriz[2][2] = Integer.parseInt(textField_10.getText());
                
                for(i=0; i<3; i++){
                    
                    for(j=0;j<3;j++){
                                
                        matriz_g[i][j] = matriz[i][j]; 
                                
                    }
                            
                }

                for(i=3; i<5; i++){
                            
                    for(j=0;j<3;j++){
                                
                        matriz_g[i][j] = matriz[i-3][j]; 	
                                
                    }
                            
                }

        // matriz g
                float a = matriz_g[0][0] * matriz_g[1][1] * matriz_g[2][2];
                float b = matriz_g[1][0] * matriz_g[2][1] * matriz_g[3][2];
                float c = matriz_g[2][0] * matriz_g[3][1] * matriz_g[4][2];
                        
                float	d = a + b + c;
                        
                float e1 = matriz_g[0][2] * matriz_g[1][1] * matriz_g[2][0];
                float f = matriz_g[1][2] * matriz_g[2][1] * matriz_g[3][0];
                float g = matriz_g[2][2] * matriz_g[3][1] * matriz_g[4][0];
                        

                float	h = e1 + f + g;				
                float   det = d - h;
                
                if (det == 0){
                    
    	      		textField22 = new JTextField();
    	      		textField22.setEnabled(true);
    	      		textField22.setEditable(false);
    	      		textField22.setColumns(10);
    	      		textField22.setBounds(268, 426, 342, 35);
    	      		textField22.setFont(new Font("Arial", Font.PLAIN, 17));
    	      		textField22.setForeground(SystemColor.black);
    	      		panel.add(textField22);
    	      		textField22.setText("No tiene matriz inversa por determinante = 0");
                    
                }
                
                else {
                	float[][] matriz_akd = new float[3][3];

                    n = 3; // tama�o de la matriz

                    float[][] I =  {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; // matriz identidad
                        
                for(i=0; i<3; i++){
                            
                    for(j=0;j<3;j++){
                                
                        matriz_akd[i][j] = matriz[i][j];
                                
                    }
                            
                }
                                
		                for (k = 0; k < n; k++) {
		                    double pivot = matriz_akd[k][k];
		                    for (j = 0; j < n; j++) {
		                        matriz_akd[k][j] /= pivot;
		                        I[k][j] /= pivot;
		                    }
		                for (i = k+1; i < n; i++) {
		                    double factor = matriz_akd[i][k];
		                    for (j = 0; j < n; j++) {
		                        matriz_akd[i][j] -= factor * matriz_akd[k][j];
		                        I[i][j] -= factor * I[k][j];
		                    }
		                }
		            }
		                
		                for (k = n-1; k >= 0; k--) {
	                        for (i = k-1; i >= 0; i--) {
	                            double factor = matriz_akd[i][k];
	                        for (j = 0; j < n; j++) {
	                            matriz_akd[i][j] -= factor * matriz_akd[k][j];
	                            I[i][j] -= factor * I[k][j];
	                        }
	                        }
	                    }
		                
		                
		                textField_1 = new JTextField();
		        		textField_1.setEditable(false);
		        		textField_1.setColumns(10);
		        		textField_1.setBounds(268, 426, 34, 35);
	    	      		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_1.setForeground(SystemColor.black);
		        		panel.add(textField_1);
		        		textField_1.setText(String.valueOf(I[0][0]));
		        		

		        		textField_11 = new JTextField();
		        		textField_11.setEditable(false);
		        		textField_11.setColumns(10);
		        		textField_11.setBounds(312, 426, 34, 35);
		        		textField_11.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_11.setForeground(SystemColor.black);
		        		panel.add(textField_11);
		        		textField_11.setText(String.valueOf(I[0][1]));
		        		
		        		textField_12 = new JTextField();
		        		textField_12.setEditable(false);
		        		textField_12.setColumns(10);
		        		textField_12.setBounds(356, 426, 34, 35);
		        		textField_12.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_12.setForeground(SystemColor.black);
		        		panel.add(textField_12);
		        		textField_12.setText(String.valueOf(I[0][2]));
		        		
		        		textField_13 = new JTextField();
		        		textField_13.setEditable(false);
		        		textField_13.setColumns(10);
		        		textField_13.setBounds(268, 470, 34, 35);
		        		textField_13.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_13.setForeground(SystemColor.black);
		        		panel.add(textField_13);
		        		textField_13.setText(String.valueOf(I[1][0]));
		        		
		        		textField_14 = new JTextField();
		        		textField_14.setEditable(false);
		        		textField_14.setColumns(10);
		        		textField_14.setBounds(312, 470, 34, 35);
		        		textField_14.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_14.setForeground(SystemColor.black);
		        		panel.add(textField_14);
		        		textField_14.setText(String.valueOf(I[1][1]));
		        		
		        		textField_15 = new JTextField();
		        		textField_15.setEditable(false);
		        		textField_15.setColumns(10);
		        		textField_15.setBounds(356, 470, 34, 35);
		        		textField_15.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_15.setForeground(SystemColor.black);
		        		panel.add(textField_15);
		        		textField_15.setText(String.valueOf(I[1][2]));
		        		
		        		textField_16 = new JTextField();
		        		textField_16.setEditable(false);
		        		textField_16.setColumns(10);
		        		textField_16.setBounds(268, 516, 34, 35);
		        		textField_16.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_16.setForeground(SystemColor.black);
		        		panel.add(textField_16);
		        		textField_16.setText(String.valueOf(I[2][0]));
		        		
		        		textField_17 = new JTextField();
		        		textField_17.setEditable(false);
		        		textField_17.setColumns(10);
		        		textField_17.setBounds(312, 516, 34, 35);
		        		textField_17.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_17.setForeground(SystemColor.black);
		        		panel.add(textField_17);
		        		textField_17.setText(String.valueOf(I[2][1]));
		        		
		        		textField_18 = new JTextField();
		        		textField_18.setEditable(false);
		        		textField_18.setColumns(10);
		        		textField_18.setBounds(356, 516, 34, 35);
		        		textField_18.setFont(new Font("Arial", Font.PLAIN, 17));
	    	      		textField_18.setForeground(SystemColor.black);
		        		panel.add(textField_18);
		        		textField_18.setText(String.valueOf(I[2][2]));
		        		
                }

			}
		});
		
		btnSum_2_1.setBounds(10, 198, 129, 39);
		panel.add(btnSum_2_1);
		
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
        
        lblMatrizUno = new JLabel("MATRIZ UNO");
        lblMatrizUno.setBounds(10, 11, 145, 14);
        panel.add(lblMatrizUno);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
