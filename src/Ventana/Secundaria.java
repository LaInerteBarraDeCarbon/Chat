package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Secundaria extends JFrame {

	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textApe;
	private String ApeyNom;
	private static Principal textFieldApeyNom;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secundaria frame = new Secundaria(textFieldApeyNom);
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
	
	
	public Secundaria(Principal textFieldApeyNom) {
		this.textFieldApeyNom = textFieldApeyNom;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNom = new JTextField();
		textNom.setBounds(66, 43, 146, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		textApe = new JTextField();
		textApe.setBounds(66, 74, 146, 20);
		contentPane.add(textApe);
		textApe.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				ApeyNom += textApe.getText() + "," + textNom.getText();  
				textFieldApeyNom.escribirTextField(ApeyNom);
				dispose();
			}
			
				
		
		});
		btnAceptar.setBounds(80, 125, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 46, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 77, 46, 14);
		contentPane.add(lblApellido);
	}

}
