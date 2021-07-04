import java.awt.BorderLayout;
import java.math.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;

public class random extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField resultado;
	JSpinner num1;
	JSpinner num2;
	JButton gen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					random frame = new random();
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
	public random() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Generador de un n\u00FAmero aleatorio");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		titulo.setBounds(10, 27, 466, 54);
		contentPane.add(titulo);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero 1");
		lblNewLabel.setBounds(74, 112, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 2");
		lblNmero.setBounds(74, 171, 66, 14);
		contentPane.add(lblNmero);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1.setBounds(74, 230, 66, 14);
		contentPane.add(lblNewLabel_1_1);
		
		resultado = new JTextField();
		resultado.setBackground(Color.WHITE);
		resultado.setEditable(false);
		resultado.setBounds(183, 227, 96, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		num1 = new JSpinner();
		num1.setBounds(183, 168, 96, 20);
		contentPane.add(num1);
		
		num2 = new JSpinner();
		num2.setBounds(183, 109, 96, 20);
		contentPane.add(num2);
		
		gen = new JButton("Generar");
		gen.setBounds(190, 285, 89, 23);
		contentPane.add(gen);
		gen.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int a = (int)num1.getValue();
		int b = (int)num2.getValue();
		int random;
		if(b>a) {
		random = (int)(Math.random()*((b+1)-a)+a);
		} else {
		random = (int)(Math.random()*((a+1)-b)+b);	
		}
		resultado.setText(Integer.toString(random));
		
	}

	
}
