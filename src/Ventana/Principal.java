package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldApeyNom;
	private Secundaria secundaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldApeyNom = new JTextField();
		textFieldApeyNom.setBounds(59, 47, 303, 20);
		contentPane.add(textFieldApeyNom);
		textFieldApeyNom.setColumns(10);
		
		JButton btnFormulario = new JButton("Formulario");
		btnFormulario.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				abseform();
			}
		});
		btnFormulario.setBounds(169, 129, 89, 23);
		contentPane.add(btnFormulario);
	}
	public void abseform(){
		new Secundaria(this);
		this.setVisible(true);
	}
	
	public  void escribirTextField(String s){
		textFieldApeyNom.setText(s);
	}
}
