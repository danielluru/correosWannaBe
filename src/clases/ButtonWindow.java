package clases;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

import sqlEjercicio.agarrarDatos;
import sqlEjercicio.sql;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class ButtonWindow extends JFrame{
	ImageIcon ImageIcon = new ImageIcon("imagen2.png");
	Image Image = ImageIcon.getImage();
	public ButtonWindow() {
		JFrame frmButtons = new JFrame();
		frmButtons.setTitle("Buttons");
		frmButtons.setIconImage(Toolkit.getDefaultToolkit().getImage(ButtonWindow.class.getResource("/imagenes/imagen2.png")));
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Añadir Paquete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPaquete paquete = new CrearPaquete();
			}
		});
		btnNewButton.setBounds(26, 235, 161, 39);
		
		JButton btnNewButton_1 = new JButton("Añadir Envio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	
			}
		});
		btnNewButton_1.setBounds(26, 285, 161, 39);
		
		JButton btnNewButton_2 = new JButton("Eliminar Empleado");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sql.eliminarEmpleado();
			}
		});
		btnNewButton_2.setBounds(26, 335, 161, 43);
		
		JButton btnNewButton_3 = new JButton("Eliminar Paquete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agarrarDatos iniciar = new agarrarDatos();
			    iniciar.eliminarPaqueteVentana();
			}
		});
		btnNewButton_3.setBounds(26, 389, 161, 42);
		
		JButton btnNewButton_4 = new JButton("Eliminar Envio");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sql.eliminarEnvio();
			}
		});
		btnNewButton_4.setBounds(26, 442, 161, 45);
		
		JButton btnNewButton_6 = new JButton("Añadir Empleado");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearEmpleado iniciar = new CrearEmpleado();
			}
		});
		frmButtons.getContentPane().setLayout(null);
		btnNewButton_6.setBounds(26, 184, 161, 40);
		
		JButton btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.setBackground(new Color(255, 0, 0));
		btnNewButton_5.setBounds(26, 498, 161, 51);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frmButtons.getContentPane().add(btnNewButton_6);
		frmButtons.getContentPane().add(btnNewButton);
		frmButtons.getContentPane().add(btnNewButton_1);
		frmButtons.getContentPane().add(btnNewButton_2);
		frmButtons.getContentPane().add(btnNewButton_3);
		frmButtons.getContentPane().add(btnNewButton_4);
		frmButtons.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ButtonWindow.class.getResource("/imagenes/imagen3.png")));
		lblNewLabel.setBounds(10, 11, 203, 162);
		frmButtons.getContentPane().add(lblNewLabel);
		

		frmButtons.setVisible(true);
		frmButtons.setSize(239, 619);
		frmButtons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que se acabe al cerrar
		frmButtons.setLocationRelativeTo(null);
		
	}
}
