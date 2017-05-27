package Ventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

@SuppressWarnings("serial")
public class Contactos extends JFrame {

	private JPanel contentPane;
	private MiChat chat;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactos frame = new Contactos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the applet.
	 */
	public Contactos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 26, 345, 156);
		contentPane.add(scrollPane);

		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("Pepe");

		JList<String> list = new JList<String>();
		scrollPane.setRowHeaderView(list);

		list.setModel(modelo);
		
		JButton btnNewButton = new JButton("Charlar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chat = new MiChat();
			}
		});

		btnNewButton.setBounds(314, 196, 69, 23);
		contentPane.add(btnNewButton);
	}
}
