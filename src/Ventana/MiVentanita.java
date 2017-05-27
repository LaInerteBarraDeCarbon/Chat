package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MiVentanita extends JFrame {

	private JPanel contentPane;
	private JTextField textField;// debe ser miembro de la clase para evitar el
									// uso de static
	private Integer numero = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanita frame = new MiVentanita();
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
	public MiVentanita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);// setea un atributo del jframe, define la posicion y los componentes que va a tener en la ventana,
									  //dos primeros parametros son ubicacion, los otros la altura q va a tener los componentes.
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnOkis = new JButton("okis");
		btnOkis.setBounds(121, 189, 185, 36);
		btnOkis.addActionListener(new ActionListener() {// agrego el evento al
														// boton
			public void actionPerformed(ActionEvent arg0) {
				numero++;
				textField.setText(numero.toString());
			}

		});
		btnOkis.setForeground(Color.BLACK);
		contentPane.add(btnOkis);

		textField = new JTextField();
		textField.setBounds(5, 236, 424, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setLocation(4, 2);
	}

}
