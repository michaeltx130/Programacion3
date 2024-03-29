//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV
//unidad 2: ejercicio 8

package ventanaJFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Mi primera ventana");
		this.setResizable(false);
		this.setLayout(null);
		
		this.loadComponents();
	}
	
	public void loadComponents() {
		JPanel login = new JPanel();
		
		login.setSize(this.getWidth(), this.getHeight());
		login.setLocation(0, 0);
		login.setLayout(null);
		login.setBackground(Color.decode("#a3e4d7"));
		
		JLabel title = new JLabel("Inicio de sesión", SwingConstants.CENTER);
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		title.setLocation(80, 20);
		title.setSize(220, 40);
		login.add(title);
		
		JLabel user_tag = new JLabel("Correo electrónico:");
		user_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		user_tag.setLocation(130, 100);
		user_tag.setSize(220, 40);
		login.add(user_tag);
		
		JTextField user_field = new JTextField();
		user_field.setBounds(100, 140, 180, 30);
		this.add(user_field);
		
		JLabel pwd_tag = new JLabel("Contraseña:");
		pwd_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		pwd_tag.setLocation(150, 200);
		pwd_tag.setSize(180, 30);
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 235, 180, 30);
		this.add(pwd_field);
		
		JButton login_btn = new JButton("ACCEDER");
		login_btn.setBounds(100, 330, 180, 30);
		
		//Eventos
		login_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ACCEDER");
				
				if(user_field.getText().length() <= 0) {
					user_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					user_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				String pwd = new String(pwd_field.getPassword());
				
				System.out.println(pwd);
				if(pwd.length() <= 0) {
					pwd_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					pwd_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				System.out.println(user_field.getText());
				System.out.println(pwd_field.getPassword());
			}
		});
		
		this.add(login_btn);
		
		JCheckBox confirmar = new JCheckBox("Recuerdame");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setBounds(20, 424, 90, 10);
		this.add(confirmar);
		
		
		JLabel olvidar = new JLabel("¿Olvidaste tu contraseña?");
		olvidar.setFont(new Font("Agency FB", Font.BOLD, 13));
		olvidar.setLocation(235, 410);
		olvidar.setSize(220, 40);
		login.add(olvidar);
		

		this.add(login);
		this.repaint();
	}
}
